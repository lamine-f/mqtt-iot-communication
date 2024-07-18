package sn.lord.iot.communication.mqttclient;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import sn.lord.iot.communication.mqttclient.messages.Message;


public class MqttGlobalClientImpl implements MqttGlobalClient {
    private final MqttClient client;
    private final String broker;
    public MqttGlobalClientImpl(String broker, String clientId) {
        try {
            this.broker = broker;
            this.client = new MqttClient(this.broker, clientId, new MemoryPersistence());
            this.connect();

        }catch (MqttException e) {
            throw new RuntimeException(e);
        }
    }

    public void connect () throws MqttException {
        MqttConnectOptions connOpts = new MqttConnectOptions();
        connOpts.setCleanSession(true);

        System.out.println("Connecting to broker: " + broker);
        client.connect(connOpts);
        System.out.println("Connected");
        client.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {
                System.out.println("Connection lost: " + cause.getMessage());
            }

            @Override
            public void messageArrived(String topic, MqttMessage message) {
                onMessageReceived(topic, message);
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {
            }
        });

    }

    public void publish(String topic, Message message) throws MqttException {
        String json = message.toJson();
        MqttMessage mqttMessage = new MqttMessage(json.getBytes());
        mqttMessage.setQos(2);
        client.publish(topic, mqttMessage);
    }

    public void subscribe(String topic) throws MqttException {
        client.subscribe(topic);
    }

    public void disconnect() throws MqttException {
        client.disconnect();
        System.out.println("Disconnected");
    }

    protected void onMessageReceived(String topic, MqttMessage message) {
    }

}

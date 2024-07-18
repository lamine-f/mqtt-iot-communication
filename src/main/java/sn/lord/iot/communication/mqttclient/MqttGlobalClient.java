package sn.lord.iot.communication.mqttclient;

import org.eclipse.paho.client.mqttv3.MqttException;
import sn.lord.iot.communication.mqttclient.messages.Message;


public interface MqttGlobalClient {
    void publish(String topic, Message message) throws MqttException;
    void subscribe(String topic) throws MqttException;
    void disconnect() throws MqttException;

}

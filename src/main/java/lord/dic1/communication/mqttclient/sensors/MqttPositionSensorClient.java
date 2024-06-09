package lord.dic1.communication.mqttclient.sensors;

import lord.dic1.communication.mqttclient.Message;
import lord.dic1.communication.mqttclient.MqttGlobalClientImpl;
import lord.dic1.communication.mqttclient.enums.MqttClientType;
import org.eclipse.paho.client.mqttv3.*;

public class MqttPositionSensorClient extends MqttGlobalClientImpl {
    public MqttPositionSensorClient(String broker, String clientId) throws MqttException {
        super(broker, clientId);
    }

    protected void onMessageReceived(String topic, MqttMessage message) {
        Message response = Message.jsonParser(
                MqttClientType.POSITION_SENSOR,
                new String(message.getPayload())
        );

        System.out.print("Position ");
        System.out.println(response);
    }

}

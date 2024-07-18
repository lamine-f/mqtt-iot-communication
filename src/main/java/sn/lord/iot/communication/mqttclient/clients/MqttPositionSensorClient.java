package sn.lord.iot.communication.mqttclient.clients;

import sn.lord.iot.communication.mqttclient.MqttGlobalClientImpl;
import org.eclipse.paho.client.mqttv3.*;
import sn.lord.iot.communication.mqttclient.messages.PositionMessage;

public class MqttPositionSensorClient extends MqttGlobalClientImpl {
    public MqttPositionSensorClient(String broker, String clientId) {
        super(broker, clientId);
    }

    protected void onMessageReceived(String topic, MqttMessage message) {
        PositionMessage positionMessage = PositionMessage.jsonParse(new String(message.getPayload()));
    }

}

package lord.dic1.communication;

import lord.dic1.communication.configs.ConfigurationManager;
import lord.dic1.communication.datas.Position;
import lord.dic1.communication.mqttclient.Message;
import lord.dic1.communication.mqttclient.MqttGlobalClient;
import lord.dic1.communication.mqttclient.enums.MqttClientType;
import lord.dic1.communication.mqttclient.sensors.PositionSensorData;
import org.eclipse.paho.client.mqttv3.MqttException;

public class App {
    private final ConfigurationManager configurationManager;
    public App (ConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    public void run () {
        String broker = this.configurationManager.getConfigValue("broker");
        String clientId = this.configurationManager.getConfigValue("clientId");
        String positionSensorTopic = this.configurationManager.getConfigValue("positionSensorTopic");

        try {
            MqttGlobalClient positionSensorClient = MqttGlobalClient.build(
                    MqttClientType.POSITION_SENSOR,
                    broker,
                    clientId
            );
            positionSensorClient.subscribe(positionSensorTopic);

            positionSensorClient.publish(
                    positionSensorTopic,
                    new Message(
                            MqttClientType.POSITION_SENSOR,
                            new PositionSensorData(
                                    "bus1",
                                    new Position("10", "-10")
                            )
                    )
            );

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    positionSensorClient.disconnect();
                } catch (MqttException e) {
                    System.err.println(e.getMessage());
                }
            }));
        } catch (MqttException me) {
            System.err.println(me.getMessage());
        }

    }
}

import org.eclipse.paho.client.mqttv3.MqttException;
import sn.lord.iot.communication.configfilemanager.ConfigurationFileManager;
import sn.lord.iot.communication.configfilemanager.ConfigurationManagerFileStore;
import sn.lord.iot.communication.configfilemanager.enums.ConfigurationManagerType;
import sn.lord.iot.communication.configfilemanager.exceptions.ConfigurationManagerTypeNotFoundException;
import sn.lord.iot.communication.mqttclient.MqttGlobalClient;
import sn.lord.iot.communication.mqttclient.clients.MqttPositionSensorClient;
import sn.lord.iot.communication.mqttclient.datas.Position;
import sn.lord.iot.communication.mqttclient.messages.PositionMessage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            ConfigurationFileManager configurationFileManager = ConfigurationManagerFileStore.get(ConfigurationManagerType.MQTT);
            String broker = configurationFileManager.getConfigValue("broker");
            String clientId = configurationFileManager.getConfigValue("clientId");
            String positionSensorTopic = configurationFileManager.getConfigValue("positionSensorTopic");

            MqttGlobalClient positionSensorClient = new MqttPositionSensorClient(broker, clientId);
            positionSensorClient.subscribe(positionSensorTopic);

            positionSensorClient.publish(
                    positionSensorTopic,
                    new PositionMessage(
                            "1",
                            new Position("10", "-10")
                    )

            );

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    positionSensorClient.disconnect();
                } catch (MqttException e) {
                    System.err.println(e.getMessage());
                }
            }));

        } catch (MqttException | ConfigurationManagerTypeNotFoundException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }


    }

}

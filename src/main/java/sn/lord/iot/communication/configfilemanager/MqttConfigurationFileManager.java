package sn.lord.iot.communication.configfilemanager;

public class MqttConfigurationFileManager extends ConfigurationFileManager {
    private static ConfigurationFileManager instance;
    private MqttConfigurationFileManager() {
        super("mqttconfig.properties");
    }

    public static ConfigurationFileManager getInstance() {
        if (instance == null) instance = new MqttConfigurationFileManager();
        return instance;
    }
}
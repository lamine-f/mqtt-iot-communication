package sn.lord.iot.communication.configfilemanager;


import sn.lord.iot.communication.configfilemanager.enums.ConfigurationManagerType;
import sn.lord.iot.communication.configfilemanager.exceptions.ConfigurationManagerTypeNotFoundException;

public class ConfigurationManagerFileStore {
    public static ConfigurationFileManager get (ConfigurationManagerType type) throws ConfigurationManagerTypeNotFoundException {
        switch (type) {
            case GLOBAL:
                return ApplicationConfigurationFileManager.getInstance();
            case MQTT:
                return MqttConfigurationFileManager.getInstance();
            default:
                throw new ConfigurationManagerTypeNotFoundException("configuration manager type not found");
        }

    }
}
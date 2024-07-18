package sn.lord.iot.communication.configfilemanager;

public class ApplicationConfigurationFileManager extends ConfigurationFileManager {
    private static ConfigurationFileManager instance;
    private ApplicationConfigurationFileManager() {
        super("config.properties");
    }

    public static ConfigurationFileManager getInstance() {
        if (instance == null) instance = new ApplicationConfigurationFileManager();
        return instance;
    }
}
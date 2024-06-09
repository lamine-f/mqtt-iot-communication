package lord.dic1.communication.configs;


import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Properties configProperties;
    private final String basePath = "/mqtt-iot-communication/src/main/java/resources/config.properties";

    private ConfigurationManager() {
        configProperties = new Properties();
        String currentPath = new File(".").getAbsolutePath()+basePath;
        try {
            FileInputStream fis = new FileInputStream(currentPath);
            configProperties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigurationManager getInstance() {
        if (instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getConfigValue(String key) {
        return configProperties.getProperty(key);
    }
}

#### Titre du projet
```
# Projet IoT Communication
```

#### Description
```
## Description
Ce projet est une application Java pour la gestion de la configuration et la communication via MQTT pour des capteurs IoT (avec l'exemple d'un cpateur de position).
```

#### Structure du projet
```
## Structure du projet
```
```
.
├── pom.xml
├── README.md
├── src
│   └── main
│       └── java
│           ├── Main.java
│           ├── resources
│           │   ├── config.properties
│           │   └── mqttconfig.properties
│           └── sn
│               └── lord
│                   └── iot
│                       └── communication
│                           ├── configfilemanager
│                           │   ├── ApplicationConfigurationFileManager.java
│                           │   ├── ConfigurationFileManager.java
│                           │   ├── ConfigurationManagerFileStore.java
│                           │   ├── enums
│                           │   │   └── ConfigurationManagerType.java
│                           │   ├── exceptions
│                           │   │   └── ConfigurationManagerTypeNotFoundException.java
│                           │   └── MqttConfigurationFileManager.java
│                           ├── mqttclient
│                           │   ├── clients
│                           │   │   └── MqttPositionSensorClient.java
│                           │   ├── datas
│                           │   │   ├── Data.java
│                           │   │   └── Position.java
│                           │   ├── enums
│                           │   │   └── DataType.java
│                           │   ├── exceptions
│                           │   │   ├── DataTypeNoExpected.java
│                           │   │   ├── MqttClientManagerClientConnexionException.java
│                           │   │   ├── MqttClientManagerPortNotDefinedException.java
│                           │   │   └── MqttClientManagerServerNotDefinedException.java
│                           │   ├── messages
│                           │   │   ├── Message.java
│                           │   │   └── PositionMessage.java
│                           │   ├── MqttGlobalClientImpl.java
│                           │   └── MqttGlobalClient.java
│                           └── utils
│                               ├── FileManager.java
│                               └── Utils.java
```

#### Installation
```
## Installation
1. Clonez le dépôt : git clone https://github.com/lamine-f/mqtt-iot-communication.git
2. Naviguez vers le dossier du projet : `cd mqtt-iot-communication`
3. Compilez le projet avec Maven : `mvn clean install`
```

#### Utilisation
```
## Utilisation
1. Exécutez l'application principale : `java -jar target/<NOM_DU_JAR>.jar`
2. Configurez les fichiers de configuration dans `src/main/resources/`
```

### Documentation des classes et des packages

#### src/main/java/Main.java
```
/**
 * Point d'entrée principal de l'application.
 */
public class Main {
    public static void main(String[] args) {
        // Code pour démarrer l'application
    }
}
```

#### src/main/java/sn/lord/iot/communication/configfilemanager/ApplicationConfigurationFileManager.java
```
/**
 * Gère les configurations de l'application.
 */
public class ApplicationConfigurationFileManager {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/configfilemanager/ConfigurationFileManager.java
```
/**
 * Classe abstraite pour gérer les fichiers de configuration.
 */
public abstract class ConfigurationFileManager {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/configfilemanager/ConfigurationManagerFileStore.java
```
/**
 * Gère le stockage des fichiers de configuration.
 */
public class ConfigurationManagerFileStore {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/configfilemanager/enums/ConfigurationManagerType.java
```
/**
 * Énumération des types de gestionnaires de configuration.
 */
public enum ConfigurationManagerType {
    APPLICATION,
    MQTT
}
```

#### src/main/java/sn/lord/iot/communication/configfilemanager/exceptions/ConfigurationManagerTypeNotFoundException.java
```
/**
 * Exception lancée lorsque le type de gestionnaire de configuration n'est pas trouvé.
 */
public class ConfigurationManagerTypeNotFoundException extends Exception {
    public ConfigurationManagerTypeNotFoundException(String message) {
        super(message);
    }
}
```

#### src/main/java/sn/lord/iot/communication/configfilemanager/MqttConfigurationFileManager.java
```
/**
 * Gère les configurations MQTT.
 */
public class MqttConfigurationFileManager {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/clients/MqttPositionSensorClient.java
```
/**
 * Client MQTT pour les capteurs de position.
 */
public class MqttPositionSensorClient {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/datas/Data.java
```
/**
 * Classe de base pour les données.
 */
public class Data {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/datas/Position.java
```
/**
 * Représente la position d'un capteur.
 */
public class Position {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/enums/DataType.java
```
/**
 * Énumération des types de données.
 */
public enum DataType {
    POSITION
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/exceptions/DataTypeNoExpected.java
```
/**
 * Exception lancée lorsque le type de données n'est pas celui attendu.
 */
public class DataTypeNoExpected extends Exception {
    public DataTypeNoExpected(String message) {
        super(message);
    }
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/exceptions/MqttClientManagerClientConnexionException.java
```
/**
 * Exception lancée lorsque la connexion du client MQTT échoue.
 */
public class MqttClientManagerClientConnexionException extends Exception {
    public MqttClientManagerClientConnexionException(String message) {
        super(message);
    }
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/exceptions/MqttClientManagerPortNotDefinedException.java
```
/**
 * Exception lancée lorsque le port du client MQTT n'est pas défini.
 */
public class MqttClientManagerPortNotDefinedException extends Exception {
    public MqttClientManagerPortNotDefinedException(String message) {
        super(message);
    }
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/exceptions/MqttClientManagerServerNotDefinedException.java
```
/**
 * Exception lancée lorsque le serveur du client MQTT n'est pas défini.
 */
public class MqttClientManagerServerNotDefinedException extends Exception {
    public MqttClientManagerServerNotDefinedException(String message) {
        super(message);
    }
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/messages/Message.java
```
/**
 * Classe de base pour les messages MQTT.
 */
public class Message {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/messages/PositionMessage.java
```
/**
 * Message représentant une position.
 */
public class PositionMessage extends Message {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/MqttGlobalClientImpl.java
```
/**
 * Implémentation du client global MQTT.
 */
public class MqttGlobalClientImpl {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/mqttclient/MqttGlobalClient.java
```
/**
 * Interface pour le client global MQTT.
 */
public interface MqttGlobalClient {
    // Déclaration des méthodes
}
```

#### src/main/java/sn/lord/iot/communication/utils/FileManager.java
```
/**
 * Utilitaire pour la gestion des fichiers.
 */
public class FileManager {
    // Implémentation de la classe
}
```

#### src/main/java/sn/lord/iot/communication/utils/Utils.java
```
/**
 * Classe utilitaire avec des méthodes d'aide.
 */
public class Utils {
    // Implémentation de la classe
}
```

### Exemple de fichier de configuration (config.properties)
```
# Fichier de configuration de l'application
mqtt.server=localhost
mqtt.port=1883
```
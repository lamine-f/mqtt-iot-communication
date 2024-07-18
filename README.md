# Projet IoT Communication

## Description
Ce projet est une application Java pour la gestion de la configuration et la communication via MQTT pour des capteurs IoT (utilisation de capteur position pour l'exemple) .

## Structure du projet

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

## Installation

1. Clonez le dépôt : `git clone https://github.com/lamine-f/mqtt-iot-communication.git`
2. Naviguez vers le dossier du projet : `cd mqtt-iot-communication`
3. Compilez le projet avec Maven : `mvn clean install`

## Utilisation

1. Exécutez l'application principale : `java -jar target/<NOM_DU_JAR>.jar`
2. Configurez les fichiers de configuration dans `src/main/resources/`

## Documentation des Classes et des Packages

### Main.java

```java
/**
 * Point d'entrée principal de l'application.
 */
public class Main {
    public static void main(String[] args) {
        // Code pour démarrer l'application
    }
}
```

### configfilemanager/ApplicationConfigurationFileManager.java

```java
/**
 * Gère les configurations de l'application.
 */
public class ApplicationConfigurationFileManager {
    // Implémentation de la classe
}
```

### configfilemanager/ConfigurationFileManager.java

```java
/**
 * Classe abstraite pour gérer les fichiers de configuration.
 */
public abstract class ConfigurationFileManager {
    // Implémentation de la classe
}
```

### configfilemanager/ConfigurationManagerFileStore.java

```java
/**
 * Gère le stockage des fichiers de configuration.
 */
public class ConfigurationManagerFileStore {
    // Implémentation de la classe
}
```

### configfilemanager/enums/ConfigurationManagerType.java

```java
/**
 * Énumération des types de gestionnaires de configuration.
 */
public enum ConfigurationManagerType {
    APPLICATION,
    MQTT
}
```

### configfilemanager/exceptions/ConfigurationManagerTypeNotFoundException.java

```java
/**
 * Exception lancée lorsque le type de gestionnaire de configuration n'est pas trouvé.
 */
public class ConfigurationManagerTypeNotFoundException extends Exception {
    public ConfigurationManagerTypeNotFoundException(String message) {
        super(message);
    }
}
```

### configfilemanager/MqttConfigurationFileManager.java

```java
/**
 * Gère les configurations MQTT.
 */
public class MqttConfigurationFileManager {
    // Implémentation de la classe
}
```

### mqttclient/clients/MqttPositionSensorClient.java

```java
/**
 * Client MQTT pour les capteurs de position.
 */
public class MqttPositionSensorClient {
    // Implémentation de la classe
}
```

### mqttclient/datas/Data.java

```java
/**
 * Classe de base pour les données.
 */
public class Data {
    // Implémentation de la classe
}
```

### mqttclient/datas/Position.java

```java
/**
 * Représente la position d'un capteur.
 */
public class Position {
    // Implémentation de la classe
}
```

### mqttclient/enums/DataType.java

```java
/**
 * Énumération des types de données.
 */
public enum DataType {
    POSITION
}
```

### mqttclient/exceptions/DataTypeNoExpected.java

```java
/**
 * Exception lancée lorsque le type de données n'est pas celui attendu.
 */
public class DataTypeNoExpected extends Exception {
    public DataTypeNoExpected(String message) {
        super(message);
    }
}
```

### mqttclient/exceptions/MqttClientManagerClientConnexionException.java

```java
/**
 * Exception lancée lorsque la connexion du client MQTT échoue.
 */
public class MqttClientManagerClientConnexionException extends Exception {
    public MqttClientManagerClientConnexionException(String message) {
        super(message);
    }
}
```

### mqttclient/exceptions/MqttClientManagerPortNotDefinedException.java

```java
/**
 * Exception lancée lorsque le port du client MQTT n'est pas défini.
 */
public class MqttClientManagerPortNotDefinedException extends Exception {
    public MqttClientManagerPortNotDefinedException(String message) {
        super(message);
    }
}
```

### mqttclient/exceptions/MqttClientManagerServerNotDefinedException.java

```java
/**
 * Exception lancée lorsque le serveur du client MQTT n'est pas défini.
 */
public class MqttClientManagerServerNotDefinedException extends Exception {
    public MqttClientManagerServerNotDefinedException(String message) {
        super(message);
    }
}
```

### mqttclient/messages/Message.java

```java
/**
 * Classe de base pour les messages MQTT.
 */
public class Message {
    // Implémentation de la classe
}
```

### mqttclient/messages/PositionMessage.java

```java
/**
 * Message représentant une position.
 */
public class PositionMessage extends Message {
    // Implémentation de la classe
}
```

### mqttclient/MqttGlobalClientImpl.java

```java
/**
 * Implémentation du client global MQTT.
 */
public class MqttGlobalClientImpl {
    // Implémentation de la classe
}
```

### mqttclient/MqttGlobalClient.java

```java
/**
 * Interface pour le client global MQTT.
 */
public interface MqttGlobalClient {
    // Déclaration des méthodes
}
```

### utils/FileManager.java

```java
/**
 * Utilitaire pour la gestion des fichiers.
 */
public class FileManager {
    // Implémentation de la classe
}
```

### utils/Utils.java

```java
/**
 * Classe utilitaire avec des méthodes d'aide.
 */
public class Utils {
    // Implémentation de la classe
}
```

## Exemple de fichier de configuration (config.properties)

```
# Fichier de configuration de l'application
mqtt.server=localhost
mqtt.port=1883
```

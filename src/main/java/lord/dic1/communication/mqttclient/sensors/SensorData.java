package lord.dic1.communication.mqttclient.sensors;


import java.io.Serializable;

public interface SensorData extends Serializable {
    String toJson ();
}

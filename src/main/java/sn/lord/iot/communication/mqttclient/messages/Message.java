package sn.lord.iot.communication.mqttclient.messages;


import java.io.Serializable;

public interface Message extends Serializable {
    String toJson ();
}

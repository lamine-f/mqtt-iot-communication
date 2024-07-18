package sn.lord.iot.communication.mqttclient.messages;

import sn.lord.iot.communication.mqttclient.datas.Position;
import sn.lord.iot.communication.utils.Utils;


public class PositionMessage implements Message {
    private String id;
    private Position position;

    public PositionMessage(String id, Position position) {
        this.id = id;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static PositionMessage jsonParse(String jsonString) {
        return Utils.GSON.fromJson(jsonString, PositionMessage.class);
    }

    @Override
    public String toJson() {
        return Utils.GSON.toJson(this);
    }

    @Override
    public String toString() {
        return "PositionSensorData{" +
                "id='" + id + '\'' +
                ", position=" + position +
                '}';
    }
}

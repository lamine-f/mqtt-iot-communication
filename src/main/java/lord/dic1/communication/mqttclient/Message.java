package lord.dic1.communication.mqttclient;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lord.dic1.communication.mqttclient.enums.MqttClientType;
import lord.dic1.communication.mqttclient.sensors.PositionSensorData;
import lord.dic1.communication.mqttclient.sensors.SensorData;

import java.lang.reflect.Type;
import java.util.Map;

public class Message {
    private final static Gson gson = new Gson();
    private final MqttClientType type;
    private final SensorData value;

    public Message (MqttClientType type, SensorData value) {
        this.type = type;
        this.value = value;
    }

    public SensorData getValue() {
        return value;
    }

    public String toJson () {
        return Message.gson.toJson(
                Map.of(
                        "type", this.type,
                        "value", value.toJson()
                )
        );
    }

    public static Message jsonParser (MqttClientType clientType, String jsonMessage) {
        Type type = new TypeToken<Map<String, Object>>(){}.getType();
        Map<String, Object> map = Message.gson.fromJson(jsonMessage, type);

        switch (clientType) {
            case POSITION_SENSOR:
               return new Message(
                       MqttClientType.valueOf( map.get("type").toString() ),
                       PositionSensorData.jsonParse( map.get("value").toString() )
               );
            default:
                throw new IllegalStateException("Unexpected value: " + clientType);
        }
    }

    @Override
    public String toString() {
        return "Message{" +
                "type=" + type +
                ", value=" + value +
                '}';
    }
}
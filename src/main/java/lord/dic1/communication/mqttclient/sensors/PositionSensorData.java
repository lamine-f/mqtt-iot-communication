package lord.dic1.communication.mqttclient.sensors;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lord.dic1.communication.datas.Position;

import java.lang.reflect.Type;

public class PositionSensorData implements SensorData {
    private static Gson gson = new Gson();
    private String id;
    private Position position;

    public static SensorData jsonParse(String jsonString) {
        Type type = new TypeToken<PositionSensorData>(){}.getType();
        return PositionSensorData.gson.fromJson(jsonString, type);
    }

    public PositionSensorData(String id, Position position) {
        this.id = id;
        this.position = position;
    }


    @Override
    public String toJson() {
        return PositionSensorData.gson.toJson(this).toString();
    }

    @Override
    public String toString() {
        return "PositionSensorData{" +
                "id='" + id + '\'' +
                ", position=" + position +
                '}';
    }
}

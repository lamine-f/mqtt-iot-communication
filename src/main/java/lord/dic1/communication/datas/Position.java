package lord.dic1.communication.datas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class Position implements Data {
    private static final Gson gson = new Gson();
    private String longitude;
    private String latitude;

    public static Data jsonParse(String jsonString) {
        Type type = new TypeToken<Position>(){}.getType();
        return Position.gson.fromJson(jsonString, type);
    }

    public Position (String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toJson() {
        return Position.gson.toJson(
                Map.of(
                        "longitude", this.longitude,
                        "latitude", this.latitude
                )
        );
    }

    @Override
    public String toString() {
        return "Position{" +
                "longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}

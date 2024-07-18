package sn.lord.iot.communication.mqttclient.datas;

import sn.lord.iot.communication.utils.Utils;

import java.util.Map;

public class Position extends Data {
    private String longitude;
    private String latitude;

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
        return Utils.GSON.toJson(
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
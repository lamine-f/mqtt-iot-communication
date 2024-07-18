package sn.lord.iot.communication.mqttclient.datas;

import com.google.gson.reflect.TypeToken;
import sn.lord.iot.communication.mqttclient.enums.DataType;
import sn.lord.iot.communication.mqttclient.exceptions.DataTypeNoExpected;
import sn.lord.iot.communication.utils.Utils;

import java.io.Serializable;
import java.lang.reflect.Type;

public abstract class Data implements Serializable {

    abstract String toJson ();
    public static Data jsonParse(DataType dataType, String jsonString) throws DataTypeNoExpected {
        Type type;
        switch (dataType) {
            case POSITION:
                type = new TypeToken<Position>(){}.getType();
                break;
            default:
                throw new DataTypeNoExpected("Unexpected value: " + dataType.name());
        }
        return Utils.GSON.fromJson(jsonString, type);
    }
}

package lord.dic1.communication.datas;

import com.google.gson.Gson;

import java.io.Serializable;

public  interface Data extends Serializable {
    String toJson ();
}

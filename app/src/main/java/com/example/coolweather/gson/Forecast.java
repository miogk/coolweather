package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/31.
 */

public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temprature;

    public class Temperature {
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}

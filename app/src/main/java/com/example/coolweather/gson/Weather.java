package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */

public class Weather {
    public Suggestion suggestion;
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

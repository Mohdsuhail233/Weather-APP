package com.cfs.Weather_APP.dto;

import java.util.ArrayList;
public class ForeCast {
    private ArrayList<ForcastDay> forecastday;

    public ArrayList<ForcastDay> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<ForcastDay> forecastday) {
        this.forecastday = forecastday;
    }
}

package com.cfs.Weather_APP.dto;

import java.util.List;


public class WeatherForCast {

    private WeatherResponse weatherResponse;
    private List<DayTemp> dayTemp;

    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    public void setWeatherResponse(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;
    }

    public List<DayTemp> getDayTemp() {
        return dayTemp;
    }

    public void setDayTemp(List<DayTemp> dayTemp) {
        this.dayTemp = dayTemp;
    }
}

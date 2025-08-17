package com.cfs.Weather_APP.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "city", "region", "country", "condition", "temperature" })
public class WeatherResponse {
    private String City;
    private String Region;
    private String country;
    private String Condition;
    private double temperature;

    public WeatherResponse(String city, String region, String country, String condition, double temperature) {
        City = city;
        Region = region;
        this.country = country;
        Condition = condition;
        this.temperature = temperature;
    }

    public WeatherResponse() {
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

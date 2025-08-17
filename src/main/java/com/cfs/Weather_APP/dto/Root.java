package com.cfs.Weather_APP.dto;

public class Root {
    public Location location;
    public Current current;
    private ForeCast forecast;


    public Root() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public ForeCast getForecast() {
        return forecast;
    }

    public void setForecast(ForeCast forecast) {
        this.forecast = forecast;
    }
}

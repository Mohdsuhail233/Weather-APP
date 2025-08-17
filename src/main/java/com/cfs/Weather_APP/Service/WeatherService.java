package com.cfs.Weather_APP.Service;


import com.cfs.Weather_APP.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Value("${weather.Api.key}")
    private String apikey;


    @Value("${weather.Api.Url}")
    private String apiUrl;

    @Value("${weather.Api.forcast.url}")
    private String forcastapiUrl;


    private RestTemplate template=new RestTemplate();



    public WeatherResponse getData(String city){
     String url=apiUrl +"?key="+apikey+"&q="+city;
        Root response =template.getForObject(url, Root.class);
        WeatherResponse weatherResponse=new WeatherResponse();

        weatherResponse.setCity(response.getLocation().name);
        weatherResponse.setRegion(response.getLocation().region);
        weatherResponse.setCountry(response.getLocation().country);
       String condtiton= response.getCurrent().getCondition().getText();
       weatherResponse.setCondition(condtiton);
       weatherResponse.setTemperature(response.getCurrent().getTemp_c());



        return weatherResponse;
    }

    public WeatherForCast getForcast(String city, int days) {
        WeatherForCast WeatherforCast = new WeatherForCast();
        WeatherResponse weatherResponse = getData(city);
        WeatherForCast response = new WeatherForCast();
        response.setWeatherResponse(weatherResponse);

        List<DayTemp> daylist = new ArrayList<>();

        String url = forcastapiUrl + "?key=" + apikey +"&q="+city +"&days=" + days;
        Root apiResponse = template.getForObject(url, Root.class);
        ForeCast forCast = apiResponse.getForecast();
        ArrayList<ForcastDay> forcastDay = forCast.getForecastday();


        for (ForcastDay day : forcastDay) {
            DayTemp d = new DayTemp();
            d.setDate(day.getDate());
            d.setMinTemp(day.getDay().mintemp_c);
            d.setAvgTemp(day.getDay().avgtemp_c);
            d.setMaxTemp(day.getDay().maxtemp_c);
            daylist.add(d);

        }

        response.setDayTemp(daylist);
        return response;
    }
}

package com.cfs.Weather_APP.Controller;


import com.cfs.Weather_APP.Service.WeatherService;
import com.cfs.Weather_APP.dto.WeatherForCast;
import com.cfs.Weather_APP.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city){
        return weatherService.getData(city);

    }


    @GetMapping("/forecast")
    public WeatherForCast getForcast(@RequestParam String city, @RequestParam int days){
        return  weatherService.getForcast(city, days);


    }








}

package com.example.zadanie31;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private String apiKey;

    public WeatherService(@Value("${openWeather.apikey}") String apiKey) {
        this.apiKey = apiKey;
    }

    public WeatherResponseDto getWeather(String city) {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, WeatherResponseDto.class);
    }
}

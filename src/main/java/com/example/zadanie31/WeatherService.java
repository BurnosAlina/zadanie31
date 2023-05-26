package com.example.zadanie31;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public WeatherResponseDto getWeather(String city) {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid=50fa66393fa8ce474786ebef10a387a9&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, WeatherResponseDto.class, city);
    }
}

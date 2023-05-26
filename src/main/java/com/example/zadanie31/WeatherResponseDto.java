package com.example.zadanie31;

import lombok.Data;

@Data
public class WeatherResponseDto {

    private MainWeatherInfo main;
    private int visibility;
    private Wind wind;
}

package com.example.zadanie31;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MainWeatherInfo {

    private BigDecimal temp;
    private BigDecimal feels_like;
    private BigDecimal temp_min;
    private BigDecimal temp_max;
    private BigDecimal pressure;
    private int humidity;
}

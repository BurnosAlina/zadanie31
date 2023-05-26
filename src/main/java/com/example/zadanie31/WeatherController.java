package com.example.zadanie31;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

@Controller
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    String home() {
        return "index";
    }

    @GetMapping("/weather")
    String showWeather(@RequestParam String city, Model model) {
        try {
            WeatherResponseDto weather = weatherService.getWeather(city);
            model.addAttribute("weather", weather);
        } catch (HttpClientErrorException.NotFound ex) {
            model.addAttribute("error", "Nie znaleziono takiego miasta");
        }
        return "index";
    }
}

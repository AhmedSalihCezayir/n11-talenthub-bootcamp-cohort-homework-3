package com.n11.homework3.controller;

import com.n11.homework3.dto.WeatherInfo;
import com.n11.homework3.dto.WeatherQueryType;
import com.n11.homework3.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<WeatherInfo> getWeatherInfo(@RequestParam String city, @RequestParam String country, @RequestParam WeatherQueryType type) {
        WeatherInfo weatherInfo = weatherService.getWeatherInfo(city, country, type);
        return ResponseEntity.ok(weatherInfo);
    }
}

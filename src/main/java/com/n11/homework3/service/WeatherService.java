package com.n11.homework3.service;

import com.n11.homework3.dto.WeatherInfo;
import com.n11.homework3.dto.WeatherQueryType;

public interface WeatherService {
    WeatherInfo getWeatherInfo(String city, String countryCode, WeatherQueryType type);
}

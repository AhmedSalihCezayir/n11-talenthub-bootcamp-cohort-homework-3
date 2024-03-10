package com.n11.homework3.dto;

import lombok.Data;

import java.util.List;

@Data
public class WeatherInfo {
    private double queryCost;
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private double tzoffset;
    private String description;
    private List<DayInfo> days;
}

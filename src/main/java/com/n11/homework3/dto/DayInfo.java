package com.n11.homework3.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DayInfo {
    private String datetime;
    private int datetimeEpoch;
    private double tempmax;
    private double tempmin;
    private double temp;
    private double feelslikemax;
    private double feelslikemin;
    private double feelslike;
    private double dew;
    private double humidity;
    private double precip;
    private double precipprob;
    private double precipcover;
    private ArrayList<String> preciptype;
    private double snow;
    private double snowdepth;
    private double windgust;
    private double windspeed;
    private double winddir;
    private double pressure;
    private double cloudcover;
    private double visibility;
    private double solarradiation;
    private double solarenergy;
    private double uvindex;
    private double severerisk;
    private String sunrise;
    private int sunriseEpoch;
    private String sunset;
    private int sunsetEpoch;
    private double moonphase;
    private String conditions;
    private String description;
    private String icon;
    private ArrayList<String> stations;
    private String source;
    private ArrayList<HourInfo> hours;
}

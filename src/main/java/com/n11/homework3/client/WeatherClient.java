package com.n11.homework3.client;

import com.n11.homework3.dto.WeatherInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "weather", url = "${weather.api.url}")
public interface WeatherClient {
    @GetMapping("/{city},{countryCode}/{startEndDate}/?key=${weather.api.key}")
    ResponseEntity<WeatherInfo> getData(@PathVariable String city,
                                        @PathVariable String countryCode,
                                        @PathVariable String startEndDate);
}

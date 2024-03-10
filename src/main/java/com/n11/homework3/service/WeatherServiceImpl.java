package com.n11.homework3.service;

import com.n11.homework3.client.WeatherClient;
import com.n11.homework3.dto.WeatherInfo;
import com.n11.homework3.dto.WeatherQueryType;
import com.n11.homework3.exception.NoSuchCountryCodeException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final WeatherClient weatherClient;

    private static final Set<String> countryCodes = Set.of(
            "JO", "BY", "TO", "LT", "BA", "ES", "MY", "UG", "SL", "RO",
            "KP", "VG", "PF", "PL", "SD", "GR", "LU", "IR", "PH", "AD",
            "AS", "TK", "FR", "MG", "AE", "YT", "JP", "TR", "CX", "SJ",
            "NG", "HM", "BL", "IT", "PW", "CZ", "AU", "KE", "SI", "NL",
            "ID", "KR", "TF", "LB", "GS", "PE", "FM", "MP", "CM", "CH",
            "BE", "TH", "AR", "TN", "AI", "WS", "KI", "HR", "VE", "KG",
            "RU", "MH", "PN", "AX", "MT", "UA", "VN", "MX", "DZ", "DE",
            "SV", "CL", "TV", "NZ", "CR", "RW", "GA", "EC", "PM", "NC",
            "CW", "BR", "WF", "LV", "CC", "SA", "SX", "BV", "CA", "IN",
            "SN", "BG", "CK", "GB", "US", "SB", "ZW", "SR", "OM", "AZ",
            "GF", "HU", "GT", "IQ", "PK", "PA", "AQ", "EG", "MA", "KZ",
            "ZA", "FJ", "UM", "DO", "NU", "CO", "VU", "CN", "BD", "SE",
            "BI"
    );

    @Override
    public WeatherInfo getWeatherInfo(String city, String countryCode, WeatherQueryType type) {
        if (!countryCodes.contains(countryCode)) {
            throw new NoSuchCountryCodeException("There is no country with country code: " + countryCode);
        }

        LocalDate currentDate = LocalDate.now();
        String endDate = "";

        if (type.equals(WeatherQueryType.WEEKLY)) {
            endDate = String.valueOf(currentDate.plusWeeks(1).minusDays(1));
        } else if (type.equals(WeatherQueryType.MONTHLY)) {
            endDate = String.valueOf(currentDate.plusMonths(1).minusDays(1));
        }

        String weatherInfoUpUntil = currentDate + "/" + endDate;
        ResponseEntity<WeatherInfo> data = weatherClient.getData(city, countryCode, weatherInfoUpUntil);
        return data.getBody();
    }
}

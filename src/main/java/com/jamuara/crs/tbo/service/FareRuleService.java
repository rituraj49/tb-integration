package com.jamuara.crs.tbo.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.Map;

@Service
public class FareRuleService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String FARE_RULE_URL =
            "http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest/FareRule";

    public Map<String, Object> getFareRule(Map<String, Object> requestBody) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<Map> response = restTemplate.exchange(
                FARE_RULE_URL,
                HttpMethod.POST,
                entity,
                Map.class
        );



        return response.getBody();
    }
}


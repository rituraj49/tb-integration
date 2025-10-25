package com.jamuara.crs.flight.service;

import com.jamuara.crs.common.service.RestService;
import com.jamuara.crs.flight.dto.tbo.*;
import com.jamuara.crs.flight.mapper.tbo.TboFareQuoteResponseMapper;
import com.jamuara.crs.flight.mapper.tbo.TboFlightRequestMapper;
import com.jamuara.crs.flight.mapper.tbo.TboFlightSearchResponseMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class TboFlightService {
    RestService restService;

    TboFlightSearchResponseMapper tboFlightSearchResponseMapper;

    TboFareQuoteResponseMapper tboFareQuoteResponseMapper;

    private final String TBO_FLIGHT_URL = "http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest";

    public TboFlightService(RestService restService, TboFlightSearchResponseMapper tboFlightSearchResponseMapper, TboFareQuoteResponseMapper tboFareQuoteResponseMapper) {
        this.restService = restService;
        this.tboFlightSearchResponseMapper = tboFlightSearchResponseMapper;
        this.tboFareQuoteResponseMapper = tboFareQuoteResponseMapper;
    }

    public FlightSearchResponse flightSearch(FlightSearchRequest searchRequest) {
        log.info("search request received: {}", searchRequest.toString());
        Map<String, Object> requestBody = TboFlightRequestMapper.mapDtoToFlightRequest(searchRequest);
//        System.out.println(requestBody);
        ResponseEntity<TboApiFlightResponseDto> response = restService.sendRequest(
                TBO_FLIGHT_URL + "/Search",
                HttpMethod.POST,
                new HashMap<>(),
                requestBody,
                new ParameterizedTypeReference<TboApiFlightResponseDto>() {}
        );

  //      System.out.println(tboFlightSearchResponseMapper.mapToFlightSearchResponse(response.getBody().getResponse()));
        return tboFlightSearchResponseMapper.mapToFlightSearchResponse(response.getBody().getResponse());
    }

    public FlightFareQuoteResponse flightFareQuote(FlightFareQuoteRequest request) {
        Map<String, String> requestBody = TboFlightRequestMapper.mapToFareQuoteRequest(request);

        ResponseEntity<TboApiFareQuoteResponseDto> responseBody = restService.sendRequest(
                TBO_FLIGHT_URL + "/FareQuote",
                HttpMethod.POST,
                new HashMap<>(),
                requestBody,
                new ParameterizedTypeReference<TboApiFareQuoteResponseDto>() {}
        );

        //FlightFareQuoteResponse response = tboFareQuoteResponseMapper.mapToFareQuoteResponse(responseBody);
         FlightFareQuoteResponse response=tboFareQuoteResponseMapper.mapToFlightFareQuoteResponse(responseBody.getBody().getResponse());

        return response;
    }
}

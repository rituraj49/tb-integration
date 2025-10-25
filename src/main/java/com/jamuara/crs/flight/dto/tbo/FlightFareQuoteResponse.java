package com.jamuara.crs.flight.dto.tbo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FlightFareQuoteResponse {

    private String traceId; @Schema(example = "false")

    private String flightDetailChangeInfo;

    private boolean priceChanged;
    private String[] itineraryChangeList;

    private Map<String, List<FlightFareDetailsResponse>> flightsAvailable;
}

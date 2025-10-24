package com.jamuara.crs.tbo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FareRuleResponse {
    private Response Response;

    public Response getResponse() {
        return Response;
    }

    public void setResponse(Response response) {
        Response = response;
    }

    @Data
    public static class Response {
        private Error Error;
        private List<FareRule> FareRules;
        private int ResponseStatus;
        private String TraceId;

    }

    @Data
    public static class Error {
        private int ErrorCode;
        private String ErrorMessage;
    }

    @Data
    public static class FareRule {

        private String Airline;
        private String Origin;
        private String Destination;
        private String DepartureDateTime;
        private String ReturnDateTime;
        private String FareBasisCode;
        private List<String> FareInclusions;
        private String FareRestriction;
        private String FareRuleDetail;
        private int FlightId;


        /*
        @JsonProperty("Airline")
        private String airline;

        @JsonProperty("Origin")
        private String origin;

        @JsonProperty("Destination")
        private String destination;

        @JsonProperty("FareBasisCode")
        private String fareBasisCode;

        @JsonProperty("FareInclusions")
        private List<String> fareInclusions;

        @JsonProperty("FareRestriction")
        private String fareRestriction;

        @JsonProperty("FareRuleDetail")
        private String fareRuleDetail;

        @JsonProperty("FlightId")
        private int flightId;

        @JsonProperty("DepartureDateTime")
        private String departureDateTime;

        @JsonProperty("ReturnDateTime")
        private String returnDateTime;
*/

    }
}


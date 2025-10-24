package com.jamuara.crs.flight.dto.tbo;

import com.jamuara.crs.tbo.model.FareQuoteResponse;
import lombok.Data;

import java.util.List;

@Data
public class TboApiFareQuoteResponseDto {
    private FareQuoteResponse.Response Response;

    public FareQuoteResponse.Response getResponse() {
        return Response;
    }

    public void setResponse(FareQuoteResponse.Response response) {
        Response = response;
    }

    @Data
    public static class Response {
        private FareQuoteResponse.Error Error;
        private boolean IsPriceChanged;
        private int ResponseStatus;
        private FareQuoteResponse.Results Results;
        private String TraceId;

    }

    @Data
    public static class Error {
        private int ErrorCode;
        private String ErrorMessage;


    }

    @Data
    public static class Results {
        private String ResultIndex;
        private boolean IsLCC;
        private boolean IsRefundable;
        private String AirlineRemark;
        private FareQuoteResponse.Fare Fare;
        private List<FareQuoteResponse.FareBreakdown> FareBreakdown;
        private List<List<FareQuoteResponse.Segment>> Segments;
        private List<FareQuoteResponse.FareRule> FareRules;
        private String ValidatingAirline;


    }

    @Data
    public static class Fare {
        private String Currency;
        private double BaseFare;
        private double Tax;
        private List<FareQuoteResponse.TaxBreakup> TaxBreakup;
        private double PublishedFare;
        private double OfferedFare;


    }

    @Data
    public static class TaxBreakup {
        private String key;
        private double value;

    }

    @Data
    public static class FareBreakdown {
        private String Currency;
        private int PassengerType;
        private int PassengerCount;
        private double BaseFare;
        private double Tax;


    }

    @Data
    public static class Segment {
        private String Baggage;
        private String CabinBaggage;
        private int CabinClass;
        private FareQuoteResponse.Airline Airline;
        private FareQuoteResponse.Origin Origin;
        private FareQuoteResponse.Destination Destination;
        private int Duration;


    }

    @Data
    public static class Airline {
        private String AirlineCode;
        private String AirlineName;
        private String FlightNumber;
        private String FareClass;

    }

    @Data
    public static class Origin {
        private FareQuoteResponse.Airport Airport;
        private String DepTime;

    }


    @Data
    public static class Destination {
        private FareQuoteResponse.Airport Airport;
        private String ArrTime;

    }

    @Data
    public static class Airport {
        private String AirportCode;
        private String AirportName;
        private String CityCode;
        private String CityName;
        private String CountryCode;
        private String CountryName;

    }

    @Data
    public static class FareRule {
        private String Origin;
        private String Destination;
        private String Airline;
        private String FareBasisCode;
        private String FareRuleDetail;
        private String FareRestriction;

    }
}

/*
package com.jamuara.crs.flight.dto.tbo;


import lombok.Data;
import java.util.List;

@Data
public class TboApiFlQuoteResponseDto {

    private Response Response;

    @Data
    public static class Response {
        private Error Error;
        private Object FlightDetailChangeInfo;
        private boolean IsPriceChanged;
        private List<Object> ItineraryChangeList;
        private int ResponseStatus;
        private Result Results;
        private String TraceId;
    }

    @Data
    public static class Error {
        private int ErrorCode;
        private String ErrorMessage;
    }

    @Data
    public static class Result {
        private List<Object> FareInclusions;
        private String FirstNameFormat;
        private boolean IsBookableIfSeatNotAvailable;
        private boolean IsExclusiveFare;
        private boolean IsFreeMealAvailable;
        private boolean IsHoldAllowedWithSSR;
        private boolean IsHoldMandatoryWithSSR;
        private String LastNameFormat;
        private String ResultIndex;
        private int Source;
        private boolean IsLCC;
        private boolean IsRefundable;
        private boolean IsPanRequiredAtBook;
        private boolean IsPanRequiredAtTicket;
        private boolean IsPassportRequiredAtBook;
        private boolean IsPassportRequiredAtTicket;
        private boolean GSTAllowed;
        private boolean IsCouponAppilcable;
        private boolean IsGSTMandatory;
        private boolean IsHoldAllowed;
        private String AirlineRemark;
        private boolean IsPassportFullDetailRequiredAtBook;
        private String ResultFareType;
        private Fare Fare;
        private List<FareBreakdown> FareBreakdown;
        private List<List<Segment>> Segments;
        private String LastTicketDate;
        private Object TicketAdvisory;
        private List<FareRule> FareRules;
        private String AirlineCode;
        private List<List<MiniFareRule>> MiniFareRules;
        private String ValidatingAirline;
        private FareClassification FareClassification;
    }

    @Data
    public static class Fare {
        private int ServiceFeeDisplayType;
        private String Currency;
        private double BaseFare;
        private double Tax;
        private List<KeyValue> TaxBreakup;
        private double YQTax;
        private double AdditionalTxnFeeOfrd;
        private double AdditionalTxnFeePub;
        private double PGCharge;
        private double OtherCharges;
        private List<KeyValue> ChargeBU;
        private double Discount;
        private double PublishedFare;
        private double CommissionEarned;
        private double PLBEarned;
        private double IncentiveEarned;
        private double OfferedFare;
        private double TdsOnCommission;
        private double TdsOnPLB;
        private double TdsOnIncentive;
        private double ServiceFee;
        private double TotalBaggageCharges;
        private double TotalMealCharges;
        private double TotalSeatCharges;
        private double TotalSpecialServiceCharges;
    }

    @Data
    public static class FareBreakdown {
        private String Currency;
        private int PassengerType;
        private int PassengerCount;
        private double BaseFare;
        private double Tax;
        private List<KeyValue> TaxBreakUp;
        private double YQTax;
        private double AdditionalTxnFeeOfrd;
        private double AdditionalTxnFeePub;
        private double PGCharge;
        private double SupplierReissueCharges;
    }

    @Data
    public static class Segment {
        private String Baggage;
        private String CabinBaggage;
        private int CabinClass;
        private String SupplierFareClass;
        private int TripIndicator;
        private int SegmentIndicator;
        private Airline Airline;
        private AirportDetail Origin;
        private AirportDetail Destination;
        private int Duration;
        private int GroundTime;
        private int Mile;
        private boolean StopOver;
        private String FlightInfoIndex;
        private String StopPoint;
        private String StopPointArrivalTime;
        private String StopPointDepartureTime;
        private String Craft;
        private String Remark;
        private boolean IsETicketEligible;
        private String FlightStatus;
        private String Status;
        private FareClassification FareClassification;
    }

    @Data
    public static class Airline {
        private String AirlineCode;
        private String AirlineName;
        private String FlightNumber;
        private String FareClass;
        private String OperatingCarrier;
    }

    @Data
    public static class AirportDetail {
        private Airport Airport;
        private String DepTime;
        private String ArrTime;
    }

    @Data
    public static class Airport {
        private String AirportCode;
        private String AirportName;
        private String Terminal;
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
        private String FareFamilyCode;
        private String FareRuleIndex;
    }

    @Data
    public static class MiniFareRule {
        private String JourneyPoints;
        private String Type;
        private String From;
        private String To;
        private String Unit;
        private String Details;
        private boolean OnlineReissueAllowed;
        private boolean OnlineRefundAllowed;
    }

    @Data
    public static class FareClassification {
        private String Color;
        private String Type;
    }

    @Data
    public static class KeyValue {
        private String key;
        private double value;
    }
}

*/

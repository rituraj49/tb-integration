package com.jamuara.crs.flight.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class TravelerRequestDto {

    @Schema(example = "1")
    private String id;

    @Schema(example = "1992-02-09")
    private String dateOfBirth;

    @Schema(example = "MALE")
    private Gender gender;

    @Schema(example = "Rahul")
    private String firstName;

    @Schema(example = "Sharma")
    private String lastName;

    @Schema(example = "rahul@test.com")
    private String email;

    private List<Phone> phones;
    private List<IdentityDocument> documents;

    @Data
    public static class Phone {
        @Schema(example = "MOBILE")
        private DeviceType deviceType;

        @Schema(example = "91")
        private String countryCallingCode;

        @Schema(example = "9999999999")
        private String number;
    }

    @Data
    public static class IdentityDocument {
        @Schema(example = "AB1234567")
        private String number;

        @Schema(example = "2026-03-01")
        private String expiryDate;

        @Schema(example = "IN", description = "two-letter ISO code of country")
        private String issuanceCountry;

        @Schema(example = "IN")
        private String nationality;

        @Schema(description = "Type of the identity document")
        private DocumentType documentType;

        @Schema(example = "true")
        private boolean holder;
    }

    public enum Gender {
        MALE,
        FEMALE,
        UNSPECIFIED,
        UNDISCLOSED
    }

    public enum DeviceType {
        MOBILE,
        LANDLINE,
        FAX,
    }

    public enum DocumentType {
        VISA,
        PASSPORT,
        IDENTITY_CARD,
        KNOWN_TRAVELER,
        REDRESS
    }
}


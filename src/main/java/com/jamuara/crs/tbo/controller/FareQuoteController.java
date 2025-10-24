package com.jamuara.crs.tbo.controller;
import com.jamuara.crs.tbo.service.FareQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/tbo")
public class FareQuoteController {

    @Autowired
    private FareQuoteService fareQuoteService;

    @PostMapping("/fare-quote")
    public ResponseEntity<?> getFareQuote(@RequestBody Map<String, Object> request) {
        try {
            Object response = fareQuoteService.getFareQuote(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Internal Error: " + e.getMessage());
        }
    }
}


package com.jamuara.crs.tbo.controller;
import com.jamuara.crs.tbo.service.FareRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Map;

@RestController
@RequestMapping("/api/fare-rule")
public class FareRuleController {

    @Autowired
    private FareRuleService fareRuleService;

    @PostMapping
    public ResponseEntity<?> getFareRules(@RequestBody Map<String, Object> request) {
        try {
            Object response = fareRuleService.getFareRule(request);
            return ResponseEntity.ok(response);
        } catch (HttpClientErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "TBO API Error", "details", e.getResponseBodyAsString()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Internal Error", "message", e.getMessage()));
        }
    }

}


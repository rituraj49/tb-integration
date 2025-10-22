package com.jamuara.crs.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Optional;

@Service
public class RestService {
    private final RestTemplate restTemplate;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T> ResponseEntity<T> sendRequest(
            String url,
            HttpMethod method,
            Map<String, String> headers,
//            Optional<String> username,
//            Optional<String> password,
            Object body,
            Class<T> responseType
        ) {
        HttpHeaders httpHeaders = new HttpHeaders();

        if(headers != null) {
            headers.forEach(httpHeaders::set);
        }

//        if(username.isPresent() && password.isPresent()) {
//            String auth = username + ":" + password;
//            String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8));
//            httpHeaders.set("Authorization", "Basic " + encodedAuth);
//        }

        if(!httpHeaders.containsKey(HttpHeaders.CONTENT_TYPE)) {
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        }

        HttpEntity<?> entity = new HttpEntity<>(body, httpHeaders);

        return restTemplate.exchange(url, method, entity, responseType);
    }
}

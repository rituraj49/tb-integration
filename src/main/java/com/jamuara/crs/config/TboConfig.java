package com.jamuara.crs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TboConfig {

    @Value("${tbo.client.username}")
    private String username;

    @Value("${tbo.client.password}")
    private String password;

    public String authenticate() {

        return "";
    }
}

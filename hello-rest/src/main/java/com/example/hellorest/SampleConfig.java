package com.example.hellorest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SampleConfig {

    @Bean
    public RestTemplate customRestTemplate() {
        return new RestTemplate();
    }
}

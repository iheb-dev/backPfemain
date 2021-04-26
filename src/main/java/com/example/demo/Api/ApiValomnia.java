package com.example.demo.Api;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiValomnia {


    private final RestTemplate restTemplate;


    public ApiValomnia(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MyService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }



    public Details someRestCall(String name) {
        return this.restTemplate.getForObject("/{name}/details", Details.class, name);
    }
}













}

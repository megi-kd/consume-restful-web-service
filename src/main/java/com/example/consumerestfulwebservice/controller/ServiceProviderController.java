package com.example.consumerestfulwebservice.controller;

import com.example.consumerestfulwebservice.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceProviderController {

    @Value("${json.url}")
    private String jsonUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String welcome(){
        return "Welcome";
    }

    @GetMapping( "/quote")
    public String getQuote(){
        Quote q =  restTemplate.getForObject(jsonUrl, Quote.class);
       return "JSON response: ".concat(q != null ? q.toString() : "");
    }
}

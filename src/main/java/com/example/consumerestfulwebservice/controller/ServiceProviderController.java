package com.example.consumerestfulwebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

    @GetMapping
    public String welcome(){
        return "Welcome";
    }
}

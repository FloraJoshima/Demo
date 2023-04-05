package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${env_name}")
    String envName;

    @GetMapping("/test")
    public ResponseEntity<String> testMethod() {

        System.out.println("Env name"+ envName);
        return  ResponseEntity.ok("Test  application running in "+envName);
    }

}

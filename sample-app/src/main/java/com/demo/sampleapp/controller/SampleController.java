package com.demo.sampleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/ping")
    public ResponseEntity<String> pingServer(){
        System.out.println("Server is up and running! 🚂 💨💨");
        return ResponseEntity.ok("Server is up and running! 🚂 💨💨");
    }
}

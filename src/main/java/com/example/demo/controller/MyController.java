package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-docker")

    public String getData(){
        return "Docker Example is goody";
    }

    @GetMapping("/test-dockers")

    public String getDatas(){
        return "Docker Example";
    }
}

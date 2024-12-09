package com.example.RestApiJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstApi {
    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola tonotos!";
    }
}

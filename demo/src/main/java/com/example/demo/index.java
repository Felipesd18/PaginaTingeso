package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/mensaje")
    public String HelloWorld() {
        return "Aplicación web simple.";
    }
}

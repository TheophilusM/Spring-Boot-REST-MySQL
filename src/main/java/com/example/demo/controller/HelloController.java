package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// return a response body always, not JSPs etc
@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HelloWorld() {
        return "Welcome to Spring Boot";
    }
}

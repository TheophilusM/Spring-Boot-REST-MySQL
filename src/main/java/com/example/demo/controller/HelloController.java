package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// return a response body always, not JSPs etc
@RestController
public class HelloController {

    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String HelloWorld() {
        return "Welcome to Spring Boot Server!";
    }
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// return a response body always, not JSPs etc
@RestController
public class HelloController {
    // using a  value saved in the config file
    @Value("${welcome.message}")
    private String welcomeMessage;

    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String HelloWorld() {
        return welcomeMessage;
    }
}

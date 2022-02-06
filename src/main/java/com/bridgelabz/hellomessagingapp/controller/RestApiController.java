package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/hello"))
public class RestApiController {
    @RequestMapping(value = { "", "/", "/home" })
    public String sayHello() {
        return "Hello from BridgeLabs...!";
    }
}

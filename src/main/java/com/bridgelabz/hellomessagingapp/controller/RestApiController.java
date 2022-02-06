package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/hello"))
public class RestApiController {
    //UC1
    @RequestMapping(value = { "", "/", "/home" })
    public String sayHello() {
        return "Hello from BridgeLabs...!";
    }
    //UC-2
    //using-http://localhost:8080/hello/query?name= Azhar
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello"+ name + "from BridgeLabs.";
    }
}

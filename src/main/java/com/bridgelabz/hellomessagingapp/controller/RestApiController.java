package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

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
    // UC-3
    //Using-http://localhost:8080/hello/param/Azhar
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello"+ name + " from BridgeLabs.";
    }
}

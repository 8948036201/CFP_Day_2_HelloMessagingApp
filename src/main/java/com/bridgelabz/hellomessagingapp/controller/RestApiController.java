package com.bridgelabz.hellomessagingapp.controller;

import com.bridgelabz.hellomessagingapp.entity.User;
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
    //Using-http://localhost:8080/hello/param/ Azhar
    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello"+ name + " from BridgeLabs.";
    }
    // UC-4
    @PostMapping ("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName()+" "+user.getLastName()+ " from BridgeLabs.";
    }

}

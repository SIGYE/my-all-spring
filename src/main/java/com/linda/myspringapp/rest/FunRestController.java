package com.linda.myspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "Hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @Value("${person.name}")
    public String personName;

    @Value("${person.role}")
    public String personRole;

    //expose the injections

    @GetMapping("/information")
    public String getPersonInfo(){
        return "Name: " +personName+ ", Role: " +personRole;
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    //expose a new end point for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "You're fortunate";
    }
}

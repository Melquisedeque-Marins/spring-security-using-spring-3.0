package com.melck.springsecurityspringboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UserController {

    @GetMapping
    public String helloEveryOne() {
        return "Hello everyone";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello admin";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello user";
    }


    
}

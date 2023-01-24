package com.melck.springsecurityspringboot3.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melck.springsecurityspringboot3.dto.AuthRequest;

@RestController
@RequestMapping("/hello")
public class UserController {

    @GetMapping("/everyone")
    public String helloEveryOne() {
        return "Hello everyone";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String helloAdmin() {
        return "Hello admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String helloUser() {
        return "Hello user";
    }

    @PostMapping("/authenticate")
    public String authenticationGetToken(AuthRequest authRequest) {
        
        return 
    }
    
}

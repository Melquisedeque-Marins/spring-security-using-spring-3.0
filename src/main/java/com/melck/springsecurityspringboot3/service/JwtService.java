package com.melck.springsecurityspringboot3.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken(String userName) {
        Map<String,Object> claims = new HashMap<>();
        return createToken(claims,userName)
    }

    private String createToken(Map<String, Object> claims, String userName) {
        return null;
    }
    
}

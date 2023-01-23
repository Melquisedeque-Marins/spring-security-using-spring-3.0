package com.melck.springsecurityspringboot3.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.melck.springsecurityspringboot3.entity.User;
import com.melck.springsecurityspringboot3.repository.UserRepository;

@Component
public class UserInfoDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByName(username);
        return user.map(UserUserDetails::new)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found "+username));
    }
    
}

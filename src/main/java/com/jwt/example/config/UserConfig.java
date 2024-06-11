package com.jwt.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

    public UserDetailsService userDetailsService() {
        UserDetails admin = User.builder().username("varun").password("varun").roles("ADMIN").build();
        UserDetails user = User.builder().username("user").password("user").roles("USER").build();
        return new InMemoryUserDetailsManager(admin, user);
    }


}

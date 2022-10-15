package com.example.thymeleafDeneme.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordCreator {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword= "admin123";
//        String rawPassword= "ekin";
        String encodedPassword = passwordEncoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}

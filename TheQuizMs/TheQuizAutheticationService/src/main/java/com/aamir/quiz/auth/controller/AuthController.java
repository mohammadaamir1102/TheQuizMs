package com.aamir.quiz.auth.controller;

import com.aamir.quiz.auth.dto.LoginRequest;
import com.aamir.quiz.auth.entity.UserCredential;
import com.aamir.quiz.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public UserCredential saveUser(@RequestBody UserCredential userCredential){
        return authService.saveUser(userCredential);
    }

    @PostMapping("/login")
    public String getToken(@RequestBody LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        if (authenticate.isAuthenticated()) {
            return authService.generateToken(loginRequest.getUsername());
        } else {
            throw new RuntimeException("invalid access");
        }
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token) {
        authService.validateToken(token);
        return "Token is valid";
    }

}

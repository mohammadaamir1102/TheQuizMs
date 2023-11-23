package com.aamir.quiz.auth.service.impl;

import com.aamir.quiz.auth.entity.UserCredential;
import com.aamir.quiz.auth.repo.UserCredentialRepo;
import com.aamir.quiz.auth.service.AuthService;
import com.aamir.quiz.auth.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserCredentialRepo userCredentialRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public UserCredential saveUser(UserCredential userCredential) {
        userCredential.setPassword(passwordEncoder.encode(userCredential.getPassword()));
        return userCredentialRepo.save(userCredential);
    }

    @Override
    public String generateToken(String username) {
        return jwtUtil.generateToken(username);
    }

    @Override
    public void validateToken(String token) {
        jwtUtil.validateToken(token);
    }
}

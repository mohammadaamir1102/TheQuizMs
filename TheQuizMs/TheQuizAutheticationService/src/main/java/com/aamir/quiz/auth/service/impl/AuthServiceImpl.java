package com.aamir.quiz.auth.service.impl;

import com.aamir.quiz.auth.entity.UserCredential;
import com.aamir.quiz.auth.repo.UserCredentialRepo;
import com.aamir.quiz.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserCredentialRepo userCredentialRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserCredential saveUser(UserCredential userCredential) {
        userCredential.setPassword(passwordEncoder.encode(userCredential.getPassword()));
        return userCredentialRepo.save(userCredential);
    }
}

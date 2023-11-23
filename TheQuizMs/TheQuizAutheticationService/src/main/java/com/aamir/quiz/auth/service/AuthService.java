package com.aamir.quiz.auth.service;

import com.aamir.quiz.auth.entity.UserCredential;

public interface AuthService {

    UserCredential saveUser(UserCredential userCredential);
    String generateToken(String username);
    void validateToken(String token);
}

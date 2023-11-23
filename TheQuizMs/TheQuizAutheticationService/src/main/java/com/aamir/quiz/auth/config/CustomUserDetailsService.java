package com.aamir.quiz.auth.config;

import com.aamir.quiz.auth.entity.UserCredential;
import com.aamir.quiz.auth.repo.UserCredentialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class CustomUserDetailsService  implements UserDetailsService {

    @Autowired
    private UserCredentialRepo userCredentialRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<UserCredential> userCredential = userCredentialRepo.findByEmail(email);
        return userCredential.map(CustomUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found with name :" + email));
    }
}

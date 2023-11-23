package com.aamir.quiz.auth.repo;

import com.aamir.quiz.auth.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialRepo extends JpaRepository<UserCredential, Long> {
}

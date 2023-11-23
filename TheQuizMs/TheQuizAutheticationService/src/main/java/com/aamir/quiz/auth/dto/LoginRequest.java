package com.aamir.quiz.auth.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LoginRequest {

    private String username;
    private String password;
}

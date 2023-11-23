package com.aamir.quiz.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class QuestionResponseVo {
    private Long questionId;
    private String question;
    private Long quizId;
}


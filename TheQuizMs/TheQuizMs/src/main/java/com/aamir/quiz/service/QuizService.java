package com.aamir.quiz.service;

import com.aamir.quiz.entity.Quiz;

import java.util.List;

public interface QuizService {
    Quiz save(Quiz quiz);

    Quiz get(Long id);

    List<Quiz> getAll();
}

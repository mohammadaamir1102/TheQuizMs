package com.aamir.question.service.service;

import com.aamir.question.service.entity.Question;

import java.util.List;

public interface QuestionService {
    Question save(Question question);
    Question getQuestion(Long id);
    List<Question> getAllQuestion();
    List<Question> getAllQuestionOfQuiz(Long id);
}

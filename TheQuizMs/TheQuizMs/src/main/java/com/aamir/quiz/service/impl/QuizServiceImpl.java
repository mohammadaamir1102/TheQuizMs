package com.aamir.quiz.service.impl;

import com.aamir.quiz.client.QuestionClient;
import com.aamir.quiz.entity.Quiz;
import com.aamir.quiz.repo.QuizRepository;
import com.aamir.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz get(Long id) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " is not exist"));
        quiz.setQuestions(questionClient.getAllQuestionOfQuiz(quiz.getQuizId()));
        return quiz;
    }

    @Override
    public List<Quiz> getAll() {
        List<Quiz> quizzes = quizRepository.findAll();
        quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getAllQuestionOfQuiz(quiz.getQuizId()));
            return quiz;
        }).toList();
        return quizzes;
    }
}

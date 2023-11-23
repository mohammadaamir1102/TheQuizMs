package com.aamir.question.service.service.impl;

import com.aamir.question.service.entity.Question;
import com.aamir.question.service.repo.QuestionRepository;
import com.aamir.question.service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question getQuestion(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " is not exist"));
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getAllQuestionOfQuiz(Long id) {
        return questionRepository.findByQuizId(id);
    }
}

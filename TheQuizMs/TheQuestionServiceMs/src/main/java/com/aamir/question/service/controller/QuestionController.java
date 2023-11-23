package com.aamir.question.service.controller;

import com.aamir.question.service.entity.Question;
import com.aamir.question.service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/save")
    public Question save(@RequestBody Question question) {
        return questionService.save(question);
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id) {
        return questionService.getQuestion(id);
    }

    @GetMapping("/getAll")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    @GetMapping("/getQuestionOfQuiz/{quizId}")
    public List<Question> getAllQuestionOfQuiz(@PathVariable Long quizId){
        return questionService.getAllQuestionOfQuiz(quizId);
    }

}

package com.aamir.quiz.controller;

import com.aamir.quiz.entity.Quiz;
import com.aamir.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/save")
    public Quiz save(@RequestBody Quiz quiz) {
        return quizService.save(quiz);
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id) {
        return quizService.get(id);
    }

    @GetMapping("/getAll")
    public List<Quiz> getAll() {
        return quizService.getAll();
    }
}

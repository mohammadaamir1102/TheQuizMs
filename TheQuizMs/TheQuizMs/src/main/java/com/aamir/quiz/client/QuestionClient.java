package com.aamir.quiz.client;

import com.aamir.quiz.vo.QuestionResponseVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "Question-Client")
public interface QuestionClient {

    @GetMapping("/question/getQuestionOfQuiz/{quizId}")
    List<QuestionResponseVo> getAllQuestionOfQuiz(@PathVariable Long quizId);
}

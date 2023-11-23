package com.aamir.quiz.entity;

import com.aamir.quiz.vo.QuestionResponseVo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quizId;
    private String title;
    transient List<QuestionResponseVo> questions;

    public Quiz() {
    }

    public Quiz(Long quizId, String title, List<QuestionResponseVo> questions) {
        this.quizId = quizId;
        this.title = title;
        this.questions = questions;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<QuestionResponseVo> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionResponseVo> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "quizId=" + quizId +
                ", title='" + title + '\'' +
                ", questions=" + questions +
                '}';
    }
}

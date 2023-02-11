package ru.otus.homework.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Question {
    private String title;
    private String answer1;
    private String answer2;
    private String answer3;
    private String correctAnswer;

}

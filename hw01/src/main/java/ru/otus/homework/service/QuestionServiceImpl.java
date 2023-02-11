package ru.otus.homework.service;


import lombok.AllArgsConstructor;
import ru.otus.homework.model.Question;
import ru.otus.homework.dao.QuestionDao;

@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionDao dao;

    @Override
    public void startTest() {
        dao.readData().forEach(this::askQuestion);
    }

    private void askQuestion(Question question) {
        System.out.println(question.getTitle());
        System.out.println("1. " + question.getAnswer1());
        System.out.println("2. " + question.getAnswer2());
        System.out.println("3. " + question.getAnswer3());
        System.out.println("Correct answer: " + question.getCorrectAnswer());
    }
}

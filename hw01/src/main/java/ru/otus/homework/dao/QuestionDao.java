package ru.otus.homework.dao;

import ru.otus.homework.model.Question;

import java.util.List;

public interface QuestionDao {
    List<Question> readData();
}

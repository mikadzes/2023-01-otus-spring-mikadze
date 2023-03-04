package ru.otus.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.homework.service.QuestionService;


public class Main {

    public static void main(String[] args) {

        var ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
        var questionService = ctx.getBean(QuestionService.class);
        questionService.startTest();
    }
}

package ru.otus.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.homework.dao.QuestionDaoCsv;

import static org.junit.jupiter.api.Assertions.*;

class QuestionDaoTest {
    public static QuestionDaoCsv dao;

    @BeforeAll
    static void beforeAll() {
        var ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
        dao = ctx.getBean(QuestionDaoCsv.class);
    }


    @Test
    void readData() {
        assertEquals(5, dao.readData().size());
    }
}
package ru.otus.homework.dao;

import lombok.SneakyThrows;
import ru.otus.homework.model.Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionDaoCsv implements QuestionDao {

    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @SneakyThrows
    @Override
    public List<Question> readData() {
        List<Question> records = new ArrayList<>();
        var is = getClass().getClassLoader().getResourceAsStream(fileName);
        assert is != null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(new Question(values[0], values[1], values[2], values[3], values[4]));
            }
            records.remove(0);
            return records;
        }
    }
}

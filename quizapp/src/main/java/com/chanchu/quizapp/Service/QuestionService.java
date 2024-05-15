package com.chanchu.quizapp.Service;

import com.chanchu.quizapp.Dao.QuestionDao;
import com.chanchu.quizapp.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();

    }
}


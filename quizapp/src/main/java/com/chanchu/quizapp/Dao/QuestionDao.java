package com.chanchu.quizapp.Dao;

import com.chanchu.quizapp.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionDao extends MongoRepository<Question,Integer> {


}

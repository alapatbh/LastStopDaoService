package com.ls.microservices.LastStopDAOService.Respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ls.microservices.LastStopDAOService.Beans.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	Question findByQuestionId(int id);
	List<Question> findByTopicId(int id);
}

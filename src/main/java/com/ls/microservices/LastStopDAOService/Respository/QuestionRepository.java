package com.ls.microservices.LastStopDAOService.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ls.microservices.LastStopDAOService.Beans.Question;
import com.ls.microservices.LastStopDAOService.Beans.Topic;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	public Topic findByQuestionId(int id);
	
}

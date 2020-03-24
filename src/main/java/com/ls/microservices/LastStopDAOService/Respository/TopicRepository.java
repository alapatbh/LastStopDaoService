package com.ls.microservices.LastStopDAOService.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ls.microservices.LastStopDAOService.Beans.Topic;


@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {
	
	public Topic findByTopicId(int id);
	
	
}

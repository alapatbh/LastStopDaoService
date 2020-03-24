package com.ls.microservices.LastStopDAOService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ls.microservices.LastStopDAOService.Beans.Topic;
import com.ls.microservices.LastStopDAOService.Respository.TopicRepository;

@RestController
@RequestMapping(value="/Topics")
public class TopicDaoController {

	@Autowired
	TopicRepository topicRepository;
	
	@GetMapping(path="/get")
	public List<Topic> getAllQuestion() {
		return (List<Topic>) topicRepository.findAll();
	}
	
	@PostMapping(path="/post")
	public void insertTopic(@RequestBody Topic topic) {
		 topicRepository.save(topic);
	}
	
}

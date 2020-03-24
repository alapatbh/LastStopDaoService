package com.ls.microservices.LastStopDAOService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ls.microservices.LastStopDAOService.Beans.Question;
import com.ls.microservices.LastStopDAOService.Respository.QuestionRepository;

@RestController
@RequestMapping(value="/Questions")
public class QuestionDaoController {
	
	@Autowired
	QuestionRepository questionRepository;
	
	@GetMapping(path="/get")
	public List<Question> getAllQuestions(){
		return (List<Question>) questionRepository.findAll();
	}
	
	@PostMapping(path="/post")
	public void insertCourse(@RequestBody Question question) {
		questionRepository.save(question);
	}
	
}

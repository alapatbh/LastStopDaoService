package com.ls.microservices.LastStopDAOService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(path="/getByTopic/{id}")
	public List<Question> getQuestionsByTopic(@PathVariable("id") String id){
		return questionRepository.findByTopicId(Integer.parseInt(id));
	}
	
	@PostMapping(path="/post")
	public void insertQuestion(@RequestBody Question question) {
		//System.out.println(question);
		questionRepository.save(question);
	}
	
}

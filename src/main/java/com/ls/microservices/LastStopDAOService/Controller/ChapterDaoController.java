package com.ls.microservices.LastStopDAOService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ls.microservices.LastStopDAOService.Beans.Chapter;
import com.ls.microservices.LastStopDAOService.Respository.ChapterRepository;

@RestController
@RequestMapping(value="/Chapters")
class ChapterDaoController {
	
	@Autowired
	ChapterRepository chapterRepository;
	
	@GetMapping(path="/get")
	List<Chapter> getAllChapter(){
		return (List<Chapter>) chapterRepository.findAll(); 
	}
	
	@GetMapping(path="/getByCourseId/{id}")
	List<Chapter> getAllChapterByCourseId(@PathVariable("id") String courseId){
		return chapterRepository.findBycourseId(Integer.parseInt(courseId));
	}
	
	@PostMapping(path="/post")
	void insertChapter(@RequestBody Chapter chapter){
		chapterRepository.save(chapter);
	}
}

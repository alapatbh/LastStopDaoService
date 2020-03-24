package com.ls.microservices.LastStopDAOService.Controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ls.microservices.LastStopDAOService.Beans.Course;
import com.ls.microservices.LastStopDAOService.Respository.LastStopDaoRepository;

@RestController
@RequestMapping("/Courses")
public class MainDaoSeriviceController {
	
	@Autowired
	private LastStopDaoRepository lastStopDao;
	
	@Autowired
	DataSource dataSource;
	
	@GetMapping(path="/get")
	public List<Course> getAllCources(){
		return  (List<Course>) lastStopDao.findAll();
	}
	
	@GetMapping(path="/get/{id}")
	public Course getCource(@PathVariable("id") String id){
		return  lastStopDao.findByCourseId(Integer.parseInt(id));
	}
	
	@PostMapping(path="/post")
	public void insertCourse(@RequestBody Course course) {
		lastStopDao.save(course);
	}
	
	@GetMapping(path="/delete/{id}")
	public Course deleteCourse(@PathVariable("id") String id) {
		return lastStopDao.deleteByCourseId(Integer.parseInt(id));
	}
}

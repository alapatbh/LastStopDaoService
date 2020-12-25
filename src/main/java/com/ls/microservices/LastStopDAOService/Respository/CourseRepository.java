package com.ls.microservices.LastStopDAOService.Respository;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import com.ls.microservices.LastStopDAOService.Beans.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
	
	Course findByCourseId(int id);
	
	//public Course deleteByCourseId(int id);
	
	
}

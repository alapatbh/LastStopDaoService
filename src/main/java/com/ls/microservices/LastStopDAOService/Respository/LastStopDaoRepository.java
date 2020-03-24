package com.ls.microservices.LastStopDAOService.Respository;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import com.ls.microservices.LastStopDAOService.Beans.Course;

@Repository
public interface LastStopDaoRepository extends CrudRepository<Course, Long> {
	
	public Course findByCourseId(int id);
	
	public Course deleteByCourseId(int id);
	
	
}

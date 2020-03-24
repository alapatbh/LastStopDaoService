package com.ls.microservices.LastStopDAOService.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ls.microservices.LastStopDAOService.Beans.Chapter;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, Long> {
	
	public Chapter findByChapterId(int id);
	
}

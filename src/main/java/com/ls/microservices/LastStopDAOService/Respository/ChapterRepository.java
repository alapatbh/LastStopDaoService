package com.ls.microservices.LastStopDAOService.Respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ls.microservices.LastStopDAOService.Beans.Chapter;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, Long> {
	
	Chapter findByChapterId(int id);
	List<Chapter> findBycourseId(int id);
}

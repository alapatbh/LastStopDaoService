package com.ls.microservices.LastStopDAOService.Controller;

import com.ls.microservices.LastStopDAOService.Controller.ChapterDaoController;
import com.ls.microservices.LastStopDAOService.Respository.ChapterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ChapterDaoController.class)
class ChapterDaoControllerIT {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private ChapterRepository chapterRepository;

	@Test
	void testGetAllChaptersByCourseId() throws Exception {
		when(chapterRepository.findBycourseId(anyInt())).thenReturn(Collections.emptyList());
		mvc.perform(get("/Chapters/getByCourseId/1")).andExpect(status().isOk());
	}
	
	@Test
	void testGetAllChapters() throws Exception {
		when(chapterRepository.findAll()).thenReturn(Collections.emptyList());
		mvc.perform(get("/Chapters/get")).andExpect(status().isOk());
	}
	
}

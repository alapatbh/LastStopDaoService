package com.ls.microservices.LastStopDAOService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;

import com.ls.microservices.LastStopDAOService.Controller.ChapterDaoController;
import com.ls.microservices.LastStopDAOService.Respository.ChapterRepository;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ChapterDaoController.class)
public class TestControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private ChapterRepository chapterRepository;

	@Test
	public void testGetAllChaptersByCourseId() throws Exception {
		when(chapterRepository.findBycourseId(anyInt())).thenReturn(new ArrayList<>());
		mvc.perform(get("/Chapters/getByCourseId/1")).andExpect(status().isOk());
	}
	
	@Test
	public void testGetAllChapters() throws Exception {
		when(chapterRepository.findAll()).thenReturn(new ArrayList<>());
		mvc.perform(get("/Chapters/get")).andExpect(status().isOk());
	}
	
}

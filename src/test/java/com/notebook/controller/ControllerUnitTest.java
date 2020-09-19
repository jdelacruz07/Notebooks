package com.notebook.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.notebook.domain.Notebook;
import com.notebook.repository.NotebookRepository;
import com.notebook.service.ApiService;

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class ControllerUnitTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockBean
	private ApiService apiService;

	@MockBean
	private NotebookRepository notebookRepository;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddNotebook() throws Exception {
		Notebook notebook = new Notebook("Yúga.",
				"Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Azul y Negro.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0,
				"/assets/IMG_4299.JPG");
		Notebook notebook2 = new Notebook("Yúga2.",
				"Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Azul y Negro.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0,
				"/assets/IMG_4299.JPG");

		when(apiService.addNotebook(notebook)).thenReturn(false);

		mockMvc.perform(post("/api").content(objectMapper.writeValueAsString(notebook))
				.contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")).andExpect(status().isConflict())
				.andReturn();

	}

	@Test
	public void testGetNotebooks() throws Exception {
		Notebook notebook = new Notebook("Yúga.",
				"Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Azul y Negro.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0,
				"/assets/IMG_4299.JPG");
		Notebook notebook2 = new Notebook("Yúga.",
				"Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Azul y Negro.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0,
				"/assets/IMG_4299.JPG");

		List<Notebook> notebooks = new ArrayList<>();
		notebooks.add(notebook);
		notebooks.add(notebook2);

		when(apiService.getAllNotebooks()).thenReturn(notebooks);

		mockMvc.perform(get("/api")).andExpect(status().isOk()).andReturn();

		mockMvc.perform(get("/api")).andExpect(status().is(200)).andReturn();

	}

	@Test
	public void testDeleteNotebook() throws Exception {
		mockMvc.perform(delete("/api/5")).andExpect(status().isNoContent()).andReturn();
		mockMvc.perform(delete("/api/a")).andExpect(status().is(204)).andReturn();

	}

}
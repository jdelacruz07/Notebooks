package com.notebook.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.notebook.domain.Notebook;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class ApiServiceTest {

	@Autowired
	private ApiService apiService;

	@Test
	void testAddNotebook() {
		int resultBefore = apiService.getAllNotebooks().size();
		Notebook notebook = new Notebook();
		notebook.setId("1");
		notebook.setModel("hello");
		notebook.setPrice(230.0);
		notebook.setSizeOfNotebook("Carta");
		notebook.setTypeOfMaterial("Papel");
		notebook.setUrlPhoto("/assets/IMG_4406.JPG");
		apiService.addNotebook(notebook);
		int resultAfter = apiService.getAllNotebooks().size();
		assertEquals(resultBefore, resultAfter - 1);
	}

	@Test
	void testDeleteNotebook() {
		int resultBefore = apiService.getAllNotebooks().size();
		Notebook notebook = apiService.getAllNotebooks().get(0);
		apiService.deleteNotebook(notebook.getId());
		int resultAfter = apiService.getAllNotebooks().size();
		assertEquals(resultBefore, resultAfter + 1);
	}

}

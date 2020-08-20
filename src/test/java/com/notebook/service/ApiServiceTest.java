package com.notebook.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;

import com.notebook.domain.Notebook;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class ApiServiceTest {

	@Autowired
	private ApiService apiService;

	@Test
	void testAddNotebook() {
		Notebook notebook = new Notebook();
		notebook.setModel("hello");
		notebook.setPrice(230.0);
		notebook.setSizeOfNotebook("Carta");
		notebook.setTypeOfMaterial("Papel");
		notebook.setUrlPhoto("/assets/IMG_4406.JPG");
		HttpStatus status = apiService.addNotebook(notebook);

		assertNotNull(status);
		assertEquals(HttpStatus.OK, status);

	}

	@Test
	void testDeleteNotebook() {
		List<Notebook> notebook = apiService.getAllNotebooks();
		Notebook notebook2 = notebook.get(0);
		HttpStatus status = apiService.deleteNotebook(notebook2.getId());
		System.out.println(status);
		assertEquals(HttpStatus.OK, status);
	}

}

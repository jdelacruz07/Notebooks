package com.notebook.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Optional;

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
		Notebook notebook = new Notebook();
		notebook.setModel("hello");
		notebook.setPrice(230.0);
		notebook.setSizeOfNotebook("Carta");
		notebook.setTypeOfMaterial("Papel");
		notebook.setUrlPhoto("/assets/IMG_4406.JPG");
		Notebook newNotebook = apiService.addNotebook(notebook);
		
		assertNotNull(newNotebook);
		assertEquals("hello", newNotebook.getModel());
		
	}

	@Test
	void testDeleteNotebook() {
		Notebook notebook = new Notebook();
		notebook.setModel("hello");
		notebook.setPrice(230.0);
		notebook.setSizeOfNotebook("Carta");
		notebook.setTypeOfMaterial("Papel");
		notebook.setUrlPhoto("/assets/IMG_4406.JPG");
		Notebook newNotebook = apiService.addNotebook(notebook);
		
		apiService.deleteNotebook(newNotebook.getId());
		Optional<Notebook> result = apiService.getNotebook(newNotebook.getId());
		
		assertEquals(Optional.empty(), result);
	}

}

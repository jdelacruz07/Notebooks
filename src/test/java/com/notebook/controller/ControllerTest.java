package com.notebook.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.notebook.domain.Notebook;

@SpringBootTest
class ControllerTest {

	@Autowired
	Controller controller;

	@Test
	void testAllNotebooks() {
		ResponseEntity<List<Notebook>> result = controller.getNotebooks();
		int numberOfNotebooks = result.getBody().size();
		assertEquals(10, numberOfNotebooks);
	}

	@Test
	void testAddNotebook() {
		int resultBefore = controller.getNotebooks().getBody().size();
		Notebook notebook = new Notebook("Yúga.",
				"Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Azul y Negro.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0,
				"/assets/IMG_4299.JPG");
		controller.addNotebook(notebook);
		int resultAfter = controller.getNotebooks().getBody().size();
		assertEquals(resultBefore, resultAfter - 1);

	}

	@Test
	void testDeleteNotebook() {
		ResponseEntity<List<Notebook>> result = controller.getNotebooks();
		int numberOfNotebooksBefore = result.getBody().size();
		List<Notebook> notebook = result.getBody();
		controller.deleteNotebook(notebook.get(0).getId());
		int numberOfNotebooksAfter = result.getBody().size();
		assertEquals(numberOfNotebooksBefore, numberOfNotebooksAfter);
	}

}

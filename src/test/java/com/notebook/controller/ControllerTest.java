package com.notebook.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.notebook.domain.Notebook;


@SpringBootTest
class ControllerTest {

	@Autowired
	Controller controller;
	
	@Test
	void testAllNotebooks() {
		int result = controller.allNotebooks().size();
		assertEquals(11, result);
	}

	@Test
	void testAddNotebook() {
		Notebook notebook = new Notebook("Libreta nueva", 230.0, "/assets/IMG_4406.JPG", "Papel", "Carta");
		controller.addNotebook(notebook);
		int result = controller.allNotebooks().size();
		assertEquals(12, result);
		
	}

	@Test
	void testDeleteNotebook() {
		List<Notebook> listOfNotebook = controller.allNotebooks();
		Notebook notebook = listOfNotebook.get(0);
		controller.deleteNotebook(notebook.getId());
		int result = controller.allNotebooks().size();
		assertEquals(10, result);
	}

}
package com.notebook.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		int result = controller.getNotebooks().size();
		assertEquals(10, result);
	}

	@Test
	void testAddNotebook() {
		int resultBefore = controller.getNotebooks().size();
		Notebook notebook = new Notebook("Modelo Yúga",
				"Encuardernacion y cubierta: tradicional de lomo recto con cubierta de papel y tela de lino",
				"Colores: Azul y Negro", "Hojas: 100 hojas blancas", "papel", "carta", 230.0, "/assets/IMG_4299.JPG");
		controller.addNotebook(notebook);
		int result = controller.getNotebooks().size();
		assertEquals(resultBefore, result-1);

	}

	@Test
	void testDeleteNotebook() {
		List<Notebook> listOfNotebook = controller.getNotebooks();
		int resultBefore = controller.getNotebooks().size();
		Notebook notebook = listOfNotebook.get(0);
		controller.deleteNotebook(notebook.getId());
		int result = controller.getNotebooks().size();
		assertEquals(resultBefore, result+1);
	}

}

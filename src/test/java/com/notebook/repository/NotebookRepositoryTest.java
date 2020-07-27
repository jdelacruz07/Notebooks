package com.notebook.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.notebook.domain.Notebook;

@SpringBootTest
class NotebookRepositoryTest {
	
	@Autowired
	NotebookRepository notebookRepository;

	@Test
	void test() {
		long result = notebookRepository.count();
		assertEquals(11, result);
	}
	
	@Test
	void getTest() {
		List<Notebook> notebooks = notebookRepository.findAll();
		Notebook notebook = notebooks.get(2);
		Optional<Notebook> notebookThree = notebookRepository.findById(notebook.getId());
		assertEquals(120, notebookThree.get().getPrice());
	}
	
	@Test
	void deleteTest() {
		List<Notebook> notebooks = notebookRepository.findAll();
		Notebook notebook = notebooks.get(2);
		notebookRepository.delete(notebook);
		assertEquals(Optional.empty(), notebookRepository.findById(notebook.getId()));
	}

}

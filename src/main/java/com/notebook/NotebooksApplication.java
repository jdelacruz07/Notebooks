package com.notebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.notebook.domain.Notebook;
import com.notebook.repository.NotebookRepository;

@SpringBootApplication
public class NotebooksApplication implements CommandLineRunner {
	
	@Autowired
	NotebookRepository notebookInterface;

	public static void main(String[] args) {
		SpringApplication.run(NotebooksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Notebook libreta1 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0,  "/assets/IMG_4299.JPG", "papel", "carta"));
		Notebook libreta2 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0,  "/assets/IMG_4317.JPG", "papel", "carta"));
		Notebook libreta3 = notebookInterface.save(new Notebook("Libreta de color azul", 120.0,  "/assets/IMG_4319.JPG", "piel", "bolsillo"));
		Notebook libreta4 = notebookInterface.save(new Notebook("Libreta de color azul", 120.0,  "/assets/IMG_4326.JPG", "tela", "bolsillo"));
		Notebook libreta5 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0,  "/assets/IMG_4343.JPG", "papel", "carta"));
		Notebook libreta6 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0,  "/assets/IMG_4370.JPG", "papel", "carta"));
		Notebook libreta7 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0, "/assets/IMG_4375.JPG", "tela", "carta"));
		Notebook libreta8 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0, "/assets/IMG_4376.JPG", "papel", "carta"));
		Notebook libreta9 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0, "/assets/IMG_4391.JPG", "papel", "carta"));
		Notebook libreta10 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0, "/assets/IMG_4394.JPG", "papel", "carta"));
		Notebook libreta11 = notebookInterface.save(new Notebook("Libreta de color azul", 230.0, "/assets/IMG_4402.JPG", "tela", "carta"));
	}

}

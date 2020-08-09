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
		Notebook libreta1 = notebookInterface.save(new Notebook("Modelo Yúga.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Colores: Azul y Negro.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4299.JPG"));
		Notebook libreta2 = notebookInterface.save(new Notebook("Modelo Akka.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", "Color: Rojo.",
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4317.JPG"));
		Notebook libreta3 = notebookInterface.save(new Notebook("Modelo Seiza  .", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4343.JPG"));
		Notebook libreta4 = notebookInterface.save(new Notebook("Modelo Furawazu.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel Japones.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4370.JPG"));
		Notebook libreta5 = notebookInterface.save(new Notebook("Modelo Pointo.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de tela.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "tela", "carta", 230.0, "/assets/IMG_4375.JPG"));
		Notebook libreta6 = notebookInterface.save(new Notebook("Modelo Utau.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel Japones y tela de lino.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4376.JPG"));
		Notebook libreta7 = notebookInterface.save(new Notebook("Modelo Kotton.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel Japones y tela de lino.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4391.JPG"));
		Notebook libreta8 = notebookInterface.save(new Notebook("Modelo Rienen.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de papel Japones y tela de lino.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "papel", "carta", 230.0, "/assets/IMG_4394.JPG"));
		Notebook libreta9 = notebookInterface.save(new Notebook("Modelo Taika.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de tela.", null,
				"Tamaño: Media carta (14.0*21.6cms), con 100 hojas blancas.", "tela", "carta", 230.0, "/assets/IMG_4402.JPG"));
		Notebook libreta10 = notebookInterface.save(new Notebook("Modelo Ada.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de piel.", null,
				"Tamaño: bolsillo (7.0*10.8cms), con 100 hojas blancas.", "piel", "bolsillo", 120.0, "/assets/IMG_4319.JPG"));
		Notebook libreta11 = notebookInterface.save(new Notebook("Modelo Nuno.", "Encuadernación y cubierta: tradicional de lomo recto con cubierta de tela.", null,
				"Tamaño: bolsillo (7.0*10.8cms), con 100 hojas blancas.", "tela", "bolsillo", 120.0, "/assets/IMG_4326.JPG"));
				
		
	}

}

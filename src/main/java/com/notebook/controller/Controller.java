package com.notebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notebook.domain.Notebook;
import com.notebook.repository.NotebookRepository;
import com.notebook.service.ApiService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	NotebookRepository notebookRepository;
	
	@Autowired
	ApiService apiservice;
	
	@GetMapping
	public List<Notebook> allNotebooks () {
		return notebookRepository.findAll(); 
	}
	
	@PostMapping
	public Notebook addNotebook(@RequestBody Notebook notebook) {
		System.out.println("Esto es un post"+ notebook);
		return apiservice.addNotebook(notebook);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteNotebook (@PathVariable String id) {
		System.out.println("Esto es un delete"+ id);
		apiservice.deleteNotebook(id);
		
	}
	
	@PutMapping 
	public void modifierNotebook (@RequestBody Notebook notebook) {
		
		System.out.println("Esto es un put");
		
	}
	
}

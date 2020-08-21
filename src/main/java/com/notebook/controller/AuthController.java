package com.notebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.notebook.service.ApiService;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	ApiService apiService;

	@GetMapping("/")
	public List<Notebook> getNotebooks() {
		return apiService.getAllNotebooks();
	}

	@PostMapping("/")
	public ResponseEntity addNotebook(@RequestBody Notebook notebook) {
		HttpStatus status = apiService.addNotebook(notebook);
		return new ResponseEntity<>(status);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteNotebook(@PathVariable String id) {
		HttpStatus status = apiService.deleteNotebook(id);
		return new ResponseEntity<>(status);
	}

	@PutMapping("/")
	public void updateNotebook(@RequestBody Notebook notebook) {
		System.out.println("Esto es un put");

	}

}

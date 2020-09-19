package com.notebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notebook.domain.Notebook;
import com.notebook.service.ApiService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	ApiService apiService;

	@PostMapping
	public ResponseEntity<Void> addNotebook(@RequestBody Notebook notebook) {

		boolean isAdded = apiService.addNotebook(notebook);
		if (isAdded) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

	@GetMapping
	public ResponseEntity<List<Notebook>> getNotebooks() {
		List<Notebook> notebooks = apiService.getAllNotebooks();
		return new ResponseEntity<List<Notebook>>(notebooks, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteNotebook(@PathVariable String id) {
		apiService.deleteNotebook(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@PutMapping
	public void updateNotebook(@RequestBody Notebook notebook) {
		System.out.println("Esto es un put");

	}

	@GetMapping("/{size}")
	public Page getNotebooksBySize(@PathVariable String size, Pageable pageable) {
		return apiService.getNotebooksBySize(size, pageable);
	}

}

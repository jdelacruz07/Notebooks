package com.notebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.notebook.domain.Notebook;
import com.notebook.repository.NotebookRepository;

@Service
public class ApiService {

	@Autowired
	NotebookRepository notebookRepository;

	public List<Notebook> getAllNotebooks() {
		return notebookRepository.findAll();
	}

	public HttpStatus addNotebook(Notebook newNotebook) {
		String isPresent = newNotebook.getId();
		if (isPresent != null) {
			return HttpStatus.FOUND;
		} else {
			notebookRepository.save(newNotebook);
			return HttpStatus.OK;
		}
	}

	public HttpStatus deleteNotebook(String id) {
		Optional<Notebook> notebook = notebookRepository.findById(id);
		if (notebook.isPresent()) {
			notebookRepository.deleteById(id);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}

	public Optional<Notebook> getNotebook(String id) {
		return notebookRepository.findById(id);
	}

}

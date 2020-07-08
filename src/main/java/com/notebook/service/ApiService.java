package com.notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notebook.domain.Notebook;
import com.notebook.repository.NotebookRepository;

@Service
public class ApiService {

	@Autowired
	NotebookRepository notebookRepository;
	
	public  Notebook addNotebook (Notebook newnotebook) {
		return notebookRepository.save(newnotebook);
	}
}

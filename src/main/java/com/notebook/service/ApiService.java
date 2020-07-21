package com.notebook.service;

import java.util.Optional;

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

	public void deleteNotebook(String id) {
		// TODO Auto-generated method stub
		 notebookRepository.deleteById(id);
	}
	
	public Optional<Notebook> getlNotebook(String id) {
		return notebookRepository.findById(id);

	}

	public  Optional<Notebook> getNotebook(String id) {
		// TODO Auto-generated method stub
		return notebookRepository.findById(id);
	}
}

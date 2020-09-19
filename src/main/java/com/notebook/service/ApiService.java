package com.notebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public boolean addNotebook(Notebook notebook) {
		System.out.println("Passa por service 1 ");
		String model = notebook.getModel();
		Notebook newNotebook = notebookRepository.findByModel(model);
		if (newNotebook != null) {
			return false;
		} else {
			notebookRepository.save(notebook);
			return true;
		}

	}

	public void deleteNotebook(String id) {
		notebookRepository.deleteById(id);
	}

	public Notebook getNotebook(String id) {
		return notebookRepository.findById(id).get();
	}

	public Page getNotebooksBySize(String size, Pageable pageable) {
		return notebookRepository.findBySizeOfNotebook(size, pageable);
	}

}

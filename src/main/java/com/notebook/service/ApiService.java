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

	public boolean addNotebook(Notebook newNotebook) {
		String model = newNotebook.getModel();
		Notebook notebook = notebookRepository.findByModel(model);
		if (notebook != null) {
			return false;
		} else {
			notebookRepository.save(newNotebook);
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

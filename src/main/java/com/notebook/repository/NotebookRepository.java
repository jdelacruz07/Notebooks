package com.notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.notebook.domain.Notebook;

public interface NotebookRepository extends MongoRepository<Notebook, String> {

	Notebook findByModel(String model);

	Page findBySizeOfNotebook(String size, Pageable pageable);

}

package com.notebook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.notebook.domain.Notebook;

public interface NotebookRepository extends MongoRepository<Notebook, String>  {

}

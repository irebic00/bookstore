package com.lureb.bookstore.repositories;

import com.lureb.bookstore.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { }

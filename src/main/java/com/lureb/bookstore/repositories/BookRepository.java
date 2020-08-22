package com.lureb.bookstore.repositories;

import com.lureb.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }

package com.lureb.bookstore.repositories;

import com.lureb.bookstore.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> { }

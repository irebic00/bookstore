package com.lureb.bookstore.bootstrap;

import com.lureb.bookstore.model.Author;
import com.lureb.bookstore.model.Book;
import com.lureb.bookstore.model.Publisher;
import com.lureb.bookstore.repositories.AuthorRepository;
import com.lureb.bookstore.repositories.BookRepository;
import com.lureb.bookstore.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) {

        Publisher publisher = new Publisher();
        publisher.setName("Skolska knjiga");
        publisher.setAddress("Prisavlje 3");
        publisher.setCity("Zagreb");
        publisher.setZipCode("10000");

        publisherRepository.save(publisher);

        Author author = new Author("Agatha", "Christie");
        Book book = new Book("Murder At Orient Express", "ISBN-007");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);
    }
}

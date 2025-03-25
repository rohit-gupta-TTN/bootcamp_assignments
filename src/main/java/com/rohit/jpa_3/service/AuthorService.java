package com.rohit.jpa_3.service;

import com.rohit.jpa_3.entity.Author;
import com.rohit.jpa_3.repository.AuthorRepository;
import com.rohit.jpa_3.repository.BookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Transactional
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    public void evictAuthor(Long id) {
        Author author = entityManager.find(Author.class, id);
        if (author != null) {
            //removes the entity from first-level cache
            entityManager.detach(author);
        }
    }

    // clear entire session cache
    public void clearCache() {
        //clear clears all entities from persistence context
        entityManager.clear();
    }
}

package com.rohit.jpa_3.controller;

import com.rohit.jpa_3.entity.Author;
import com.rohit.jpa_3.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }

    @DeleteMapping("/evict/{id}")
    public String evictAuthor(@PathVariable Long id) {
        authorService.evictAuthor(id);
        return "Author entity with ID " + id + " evicted from cache.";
    }

    @DeleteMapping("/clear-cache")
    public String clearCache() {
        authorService.clearCache();
        return "Hibernate session cache cleared.";
    }
}

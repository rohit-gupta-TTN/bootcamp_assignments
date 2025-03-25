package com.rohit.jpa_3.repository;

import com.rohit.jpa_3.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}

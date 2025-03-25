package com.rohit.jpa_3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    // Many-to-One Relationship
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // Many-to-Many Relationship
    @ManyToMany(mappedBy = "manyToManyBooks")
    private List<Author> authors;
}

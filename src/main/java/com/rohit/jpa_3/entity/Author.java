package com.rohit.jpa_3.entity;

import com.rohit.jpa_3.embeded.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> subjects;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "book_id")
//    private Book book;
//
//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    private List<Book> books;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "author_book",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    private List<Book> booksManyToMany;

    // One-to-One Relationship
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "one_to_one_book_id")
    private Book oneToOneBook;

    // One-to-Many Relationship
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> oneToManyBooks;

    // Many-to-Many Relationship
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book_many_to_many",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> manyToManyBooks;

}
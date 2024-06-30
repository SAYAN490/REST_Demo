package com.apple.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.apple.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

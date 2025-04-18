package com.cospes.webAPItest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cospes.webAPItest.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
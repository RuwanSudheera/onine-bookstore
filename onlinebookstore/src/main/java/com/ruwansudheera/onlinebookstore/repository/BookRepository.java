package com.ruwansudheera.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruwansudheera.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}

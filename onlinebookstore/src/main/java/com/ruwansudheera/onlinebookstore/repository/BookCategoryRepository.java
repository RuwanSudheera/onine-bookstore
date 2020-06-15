package com.ruwansudheera.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruwansudheera.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{
	
}

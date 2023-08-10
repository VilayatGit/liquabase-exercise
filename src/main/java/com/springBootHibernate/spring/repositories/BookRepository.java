package com.springBootHibernate.spring.repositories;

import com.springBootHibernate.spring.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

package com.teorerras.book_library_app.repository;

import com.teorerras.book_library_app.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

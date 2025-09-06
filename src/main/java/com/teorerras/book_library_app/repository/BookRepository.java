package com.teorerras.book_library_app.repository;

import com.teorerras.book_library_app.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findByTitleContaining(@RequestParam String title, Pageable pageable);

    Page<Book> findByCategory(@RequestParam String category, Pageable pageable);
}

package com.roniustek.library.bookrepository;

import com.roniustek.library.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}

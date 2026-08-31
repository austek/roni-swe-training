package com.roniustek.library.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

  @Id @GeneratedValue private Long id;

  private String isbn;
  private String title;
  private String author;
  private Boolean available;

  public Book() {}

  public Book(Long id, String isbn, String title, String author, Boolean available) {
    this.id = id;
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.available = available;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }
}

package com.example.demo.service;

import com.example.demo.pojo.entity.Books;
import com.example.demo.pojo.input.BookInput;

import java.util.List;

public interface BooksService {

    List<Books> findAll();
    Books findBookById(Integer id);
    Books save(BookInput bookInput);
    Books update(Books book, BookInput bookInput);
    void delete(Integer id);
}

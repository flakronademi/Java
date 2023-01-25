package com.example.demo.controller;

import com.example.demo.pojo.entity.Books;
import com.example.demo.pojo.input.BookInput;
import com.example.demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/book")
    public List<Books> getBook() {
        return booksService.findAll();
    }

    @GetMapping("/book/{id}")
    public Books findBook(@PathVariable Integer id) {
        return booksService.findBookById(id);
    }

    @PostMapping("/book")
    public Books createBook(@RequestBody BookInput bookInput) {
        return booksService.save(bookInput);
    }

    @PutMapping("/book/{id}")
    public Books updateBook(@PathVariable Integer id,
                                   @RequestBody BookInput bookInput) {

        Books book = booksService.findBookById(id);
        if (book == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return booksService.update(book, bookInput);
    }

    @DeleteMapping("/book/{id}")
    public boolean deleteBook(@PathVariable Integer id) {
        booksService.delete(id);
        return true;
    }

}

package com.example.library.Controllers;

import com.example.library.PoJo.entity.LibraryBooks;
import com.example.library.PoJo.input.LibraryBookInput;
import com.example.library.Services.LibraryBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LibraryBooksController {

    @Autowired
    private LibraryBooksService libraryBooksService;

    @GetMapping("/librarybook")
    public List<LibraryBooks> getBook() {
        return libraryBooksService.findAll();
    }

    @GetMapping("/librarybook/{id}")
    public LibraryBooks findBook(@PathVariable Integer id) {
        return libraryBooksService.findBookById(id);
    }

    @PostMapping("/librarybook")
    public LibraryBooks createBook(@RequestBody LibraryBookInput libraryBookInput) {
        return libraryBooksService.save(libraryBookInput);
    }

    @PutMapping("/librarybook/{id}")
    public LibraryBooks updateBook(@PathVariable Integer id,
                                   @RequestBody LibraryBookInput libraryBookInput) {

        LibraryBooks book = libraryBooksService.findBookById(id);
        if (book == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return libraryBooksService.update(book, libraryBookInput);
    }

    @DeleteMapping("/librarybook/{id}")
    public boolean deleteBook(@PathVariable Integer id) {
        libraryBooksService.delete(id);
        return true;
    }

}

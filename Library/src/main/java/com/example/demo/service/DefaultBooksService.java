package com.example.demo.service;

import com.example.demo.pojo.entity.Books;
import com.example.demo.pojo.input.BookInput;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultBooksService implements BooksService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Books> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Books findBookById(Integer id) {
        if (id == null) {
            return null;
        }
        return bookRepository.findBookById(id);
    }

    @Override
    public Books save(BookInput bookInput) {
        String newName = bookInput.getName();
        String newAuthor = bookInput.getAuthor();
        String newDescription = bookInput.getDescription();




        Books book = new Books();
        book.setName(newName);
        book.setAuthor(newAuthor);
        book.setDescription(newDescription);



        return bookRepository.save(book);
    }

    @Override
    public Books update(Books book, BookInput bookInput) {
        String updateName = bookInput.getName();
        String udpateAuthor = bookInput.getAuthor();
        String updateDescription = bookInput.getDescription();

        book.setName(updateName);
        book.setAuthor(udpateAuthor);
        book.setDescription(updateDescription);


        return bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }

}

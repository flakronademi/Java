package com.example.demo.repository;

import com.example.demo.pojo.entity.Books;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Books, Integer> {

    List<Books> findAll();
    Books findBookById(Integer id);

}

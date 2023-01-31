package com.example.library.Repository;

import com.example.library.PoJo.entity.LibraryBooks;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryBookRepository extends CrudRepository<LibraryBooks, Integer> {

	List<LibraryBooks> findAll();

	LibraryBooks findBookById(Integer id);

}

package com.example.library.Services;

import com.example.library.PoJo.entity.LibraryBooks;
import com.example.library.PoJo.input.LibraryBookInput;

import java.util.List;

public interface LibraryBooksService {
	List<LibraryBooks> findAll();

	LibraryBooks findBookById(Integer id);

	LibraryBooks save(LibraryBookInput libraryBookInput);

	LibraryBooks update(LibraryBooks book, LibraryBookInput libraryBookInput);

	void delete(Integer id);
}

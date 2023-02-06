package com.example.library.Services;

import com.example.library.PoJo.entity.LibraryBooks;
import com.example.library.PoJo.input.LibraryBookInput;
import com.example.library.Repository.LibraryBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibraryDFBooksService implements LibraryBooksService {

	@Autowired
	private LibraryBookRepository libraryBookRepository;

	@Override
	public List<LibraryBooks> findAll() {
		return libraryBookRepository.findAll();
	}

	@Override
	public LibraryBooks findBookById(Integer id) {
		if (id == null) {
			return null;
		}
		return libraryBookRepository.findBookById(id);
	}

	@Override
	public LibraryBooks save(LibraryBookInput libraryBookInput) {
		String newName = libraryBookInput.getName();
		String newAuthor = libraryBookInput.getAuthor();
		String newDescription = libraryBookInput.getDescription();


		LibraryBooks book = new LibraryBooks();
		book.setName(newName);
		book.setAuthor(newAuthor);
		book.setDescription(newDescription);


		return libraryBookRepository.save(book);
	}

	@Override
	public LibraryBooks update(LibraryBooks book, LibraryBookInput libraryBookInput) {
		String updateName = libraryBookInput.getName();
		String updateAuthor = libraryBookInput.getAuthor();
		String updateDescription = libraryBookInput.getDescription();

		book.setName(updateName);
		book.setAuthor(updateAuthor);
		book.setDescription(updateDescription);


		return libraryBookRepository.save(book);
	}

	@Override
	public void delete(Integer id) {
		libraryBookRepository.deleteById(id);
	}

}

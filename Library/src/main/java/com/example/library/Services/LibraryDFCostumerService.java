package com.example.library.Services;

import com.example.library.PoJo.entity.LibraryCostumer;
import com.example.library.PoJo.input.LibraryCostumerInput;
import com.example.library.Repository.LibraryCostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibraryDFCostumerService implements LibraryCostumerService {

	@Autowired
	private LibraryCostumerRepository libraryCostumerRepository;

	@Override
	public List<LibraryCostumer> findAll() {
		return libraryCostumerRepository.findAll();
	}

	@Override
	public LibraryCostumer findCostumerById(Integer id) {
		if (id == null) {
			return null;
		}
		return libraryCostumerRepository.findCostumerById(id);
	}

	@Override
	public LibraryCostumer save(LibraryCostumerInput costumerInput) {
		String newName = costumerInput.getName();
		String newSurname = costumerInput.getSurname();


		LibraryCostumer libraryCostumer = new LibraryCostumer();
		libraryCostumer.setName(newName);
		libraryCostumer.setSurname(newSurname);


		return libraryCostumerRepository.save(libraryCostumer);
	}

	@Override
	public LibraryCostumer update(LibraryCostumer libraryCostumer, LibraryCostumerInput costumerInput) {
		String newName = costumerInput.getName();
		String newSurname = costumerInput.getSurname();


		libraryCostumer.setName(newName);
		libraryCostumer.setSurname(newSurname);


		return libraryCostumerRepository.save(libraryCostumer);
	}

	@Override
	public void delete(Integer id) {
		libraryCostumerRepository.deleteById(id);
	}

}

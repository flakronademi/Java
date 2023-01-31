package com.example.library.Services;

import com.example.library.PoJo.entity.LibraryCostumer;
import com.example.library.PoJo.input.LibraryCostumerInput;

import java.util.List;

public interface LibraryCostumerService {
	List<LibraryCostumer> findAll();

	LibraryCostumer findCostumerById(Integer id);

	LibraryCostumer save(LibraryCostumerInput costumerInput);

	LibraryCostumer update(LibraryCostumer location, LibraryCostumerInput costumerInput);

	void delete(Integer id);
}

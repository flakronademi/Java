package com.example.library.Repository;

import com.example.library.PoJo.entity.LibraryCostumer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryCostumerRepository extends CrudRepository<LibraryCostumer, Integer> {

	List<LibraryCostumer> findAll();

	LibraryCostumer findCostumerById(Integer id);

}

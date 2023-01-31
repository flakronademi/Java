package com.example.library.Repository;

import com.example.library.PoJo.entity.LibraryBooking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryBookingRespository extends CrudRepository<LibraryBooking, Integer> {

	List<LibraryBooking> findAll();

	LibraryBooking findBookingById(Integer id);

}

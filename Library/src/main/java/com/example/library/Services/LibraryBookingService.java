package com.example.library.Services;

import com.example.library.PoJo.entity.LibraryBooking;
import com.example.library.PoJo.input.LibraryBookingInput;

import java.util.List;

public interface LibraryBookingService {
	List<LibraryBooking> findAll();

	LibraryBooking findBookingById(Integer id);

	LibraryBooking save(LibraryBookingInput libraryBookingInput);

	LibraryBooking update(LibraryBooking libraryBooking, LibraryBookingInput libraryBookingInput);

	void delete(Integer id);
}

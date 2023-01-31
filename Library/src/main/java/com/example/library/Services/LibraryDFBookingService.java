package com.example.library.Services;

import com.example.library.PoJo.entity.LibraryBooking;
import com.example.library.PoJo.entity.LibraryBooks;
import com.example.library.PoJo.entity.LibraryCostumer;
import com.example.library.PoJo.input.LibraryBookingInput;
import com.example.library.Repository.LibraryBookingRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

public class LibraryDFBookingService implements LibraryBookingService {
	@Autowired
	private LibraryBookingRespository libraryBookingRespository;

	@Override
	public List<LibraryBooking> findAll() {
		return libraryBookingRespository.findAll();
	}

	@Override
	public LibraryBooking findBookingById(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException("Booking ID must not be null.");
		}
		return libraryBookingRespository.findBookingById(id);
	}

	@Override
	public LibraryBooking save(LibraryBookingInput libraryBookingInput) {
		LibraryBooks newBookid = libraryBookingInput.getBookid();
		LibraryCostumer newCostumerid = libraryBookingInput.getCostumerid();
		Date newLoaned = libraryBookingInput.getLoaned();
		Date newReturned = libraryBookingInput.getReturned();

		LibraryBooking libraryBooking = new LibraryBooking();
		libraryBooking.setBookid(newBookid);
		libraryBooking.setCostumerid(newCostumerid);
		libraryBooking.setLoaned(newLoaned);
		libraryBooking.setReturned(newReturned);
		return libraryBookingRespository.save(libraryBooking);
	}

	@Override
	public LibraryBooking update(LibraryBooking libraryBooking, LibraryBookingInput libraryBookingInput) {
		LibraryBooks updateBookid = libraryBookingInput.getBookid();
		LibraryCostumer updateCostumerid = libraryBookingInput.getCostumerid();
		Date updateLoaned = libraryBookingInput.getLoaned();
		Date updateReturned = libraryBookingInput.getReturned();

		libraryBooking.setBookid(updateBookid);
		libraryBooking.setCostumerid(updateCostumerid);
		libraryBooking.setLoaned(updateLoaned);
		libraryBooking.setReturned(updateReturned);

		return libraryBookingRespository.save(libraryBooking);
	}

	@Override
	public void delete(Integer id) {
		libraryBookingRespository.deleteById(id);
	}
}

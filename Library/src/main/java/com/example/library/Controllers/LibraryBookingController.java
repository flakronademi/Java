package com.example.library.Controllers;

import com.example.library.PoJo.entity.LibraryBooking;
import com.example.library.PoJo.input.LibraryBookingInput;
import com.example.library.Services.LibraryBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LibraryBookingController {

	@Autowired
	private LibraryBookingService libraryBookingServices;

	@GetMapping("/librarybooking")
	public List<LibraryBooking> getBooking() {
		return libraryBookingServices.findAll();
	}

	@GetMapping("/librarybooking/{id}")
	public LibraryBooking findBooking(@PathVariable Integer id) {
		return libraryBookingServices.findBookingById(id);
	}

	@PostMapping("/booking")
	public LibraryBooking createBooking(@RequestBody LibraryBookingInput libraryBookingInput) {
		return libraryBookingServices.save(libraryBookingInput);
	}

	@PutMapping("/librarybooking/{id}")
	public LibraryBooking updateBooking(@PathVariable Integer id,
	                                    @RequestBody LibraryBookingInput libraryBookingInput) {

		LibraryBooking libraryBooking = libraryBookingServices.findBookingById(id);
		if (libraryBooking == null) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
			);
		}

		return libraryBookingServices.update(libraryBooking, libraryBookingInput);
	}

	@DeleteMapping("/librarybooking/{id}")
	public boolean deleteBooking(@PathVariable Integer id) {
		libraryBookingServices.delete(id);
		return true;
	}

}

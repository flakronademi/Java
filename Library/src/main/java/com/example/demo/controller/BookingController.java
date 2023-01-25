package com.example.demo.controller;

import com.example.demo.pojo.entity.Booking;
import com.example.demo.pojo.input.BookingInput;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingServices;

    @GetMapping("/booking")
    public List<Booking> getBooking() {
        return bookingServices.findAll();
    }

    @GetMapping("/booking/{id}")
    public Booking findBooking(@PathVariable Integer id) {
        return bookingServices.findBookingById(id);
    }

    @PostMapping("/booking")
    public Booking createBooking(@RequestBody BookingInput bookingInput) {
        return bookingServices.save(bookingInput);
    }

    @PutMapping("/booking/{id}")
    public Booking updateBooking(@PathVariable Integer id,
                                   @RequestBody BookingInput bookingInput) {

        Booking booking = bookingServices.findBookingById(id);
        if (booking == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return bookingServices.update(booking, bookingInput);
    }

    @DeleteMapping("/booking/{id}")
    public boolean deleteBooking(@PathVariable Integer id) {
        bookingServices.delete(id);
        return true;
    }

}

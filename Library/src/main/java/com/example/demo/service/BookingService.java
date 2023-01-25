package com.example.demo.service;

import com.example.demo.pojo.entity.Booking;
import com.example.demo.pojo.input.BookingInput;

import java.util.List;

public interface BookingService {

    List<Booking> findAll();
    Booking findBookingById(Integer id);
    Booking save(BookingInput bookingInput);
    Booking update(Booking booking, BookingInput bookingInput);
    void delete(Integer id);
}

package com.example.demo.service;

import com.example.demo.pojo.entity.Booking;
import com.example.demo.pojo.entity.Books;
import com.example.demo.pojo.entity.Costumer;
import com.example.demo.pojo.input.BookingInput;
import com.example.demo.repository.BookingRespository;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.Date;
import java.util.List;

public class DefaultBookingService implements BookingService {

    @Autowired
    private BookingRespository bookingRespository;

    @Override
    public List<Booking> findAll() {
        return bookingRespository.findAll();
    }

    @Override
    public Booking findBookingById(Integer id) {
        if (id == null) {
            return null;
        }
        return bookingRespository.findBookingById(id);
    }

    @Override
    public Booking save(BookingInput bookingInput) {
        Books newBookid=bookingInput.getBookid();
        Costumer newCostumerid=bookingInput.getCostumerid();
        Date newLoaned=bookingInput.getLoaned();
        Date newReturned=bookingInput.getReturned();




        Booking booking = new Booking();
        booking.setBookid(newBookid);
        booking.setCostumerid(newCostumerid);
        booking.setLoaned(newLoaned);
        booking.setReturned(newReturned);


        return bookingRespository.save(booking);
    }

    @Override
    public Booking update(Booking booking, BookingInput bookingInput) {

        Books updateBookid=bookingInput.getBookid();
        Costumer updateCostumerid=bookingInput.getCostumerid();
        Date updateLoaned=bookingInput.getLoaned();
        Date updateReturned=bookingInput.getReturned();

        booking.setBookid(updateBookid);
        booking.setCostumerid(updateCostumerid);
        booking.setLoaned(updateLoaned);
        booking.setReturned(updateReturned);

        return bookingRespository.save(booking);
    }

    @Override
    public void delete(Integer id) {
        bookingRespository.deleteById(id);
    }

}

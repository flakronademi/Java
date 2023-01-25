package com.example.demo.repository;

import com.example.demo.pojo.entity.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRespository extends CrudRepository<Booking, Integer> {

    List<Booking> findAll();

    Booking findBookingById(Integer id);

}

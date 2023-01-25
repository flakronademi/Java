package com.example.demo.config;

import com.example.demo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesAutoConfiguration {

    @Bean
    public CostumerService costumerServiceService() {
        return new DefaultCostumerService();
    }

    @Bean
    public BookingService bookingServiceService() {
        return new DefaultBookingService();
    }

    @Bean
    public BooksService bookServiceService() {
        return new DefaultBooksService();
    }


}

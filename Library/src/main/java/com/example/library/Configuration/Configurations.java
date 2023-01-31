package com.example.library.Configuration;

import com.example.library.Services.*;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configurations {

	@Bean
	public LibraryCostumerService costumerServiceService() {
		return new LibraryDFCostumerService();
	}

	@Bean
	public LibraryBookingService bookingServiceService() {
		return new LibraryDFBookingService();
	}

	@Bean
	public LibraryBooksService bookServiceService() {
		return new LibraryDFBooksService();
	}


}

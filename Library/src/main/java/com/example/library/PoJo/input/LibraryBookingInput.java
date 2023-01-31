package com.example.library.PoJo.input;

import com.example.library.PoJo.entity.LibraryBooks;
import com.example.library.PoJo.entity.LibraryCostumer;

import java.sql.Date;

public class LibraryBookingInput {

	private LibraryBooks bookid;
	private LibraryCostumer costumerid;
	private Date loaned;
	private Date returned;


	public LibraryBookingInput(LibraryBooks bookid, LibraryCostumer costumerid, Date loaned, Date returned) {
		this.bookid = bookid;
		this.costumerid = costumerid;
		this.loaned = loaned;
		this.returned = returned;
	}

	public LibraryBooks getBookid() {
		return bookid;
	}

	public void setBookid(LibraryBooks bookid) {
		this.bookid = bookid;
	}

	public LibraryCostumer getCostumerid() {
		return costumerid;
	}

	public void setCostumerid(LibraryCostumer costumerid) {
		this.costumerid = costumerid;
	}

	public Date getLoaned() {
		return loaned;
	}

	public void setLoaned(Date loaned) {
		this.loaned = loaned;
	}

	public Date getReturned() {
		return returned;
	}

	public void setReturned(Date returned) {
		this.returned = returned;
	}
}

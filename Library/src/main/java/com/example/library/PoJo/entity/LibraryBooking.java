package com.example.library.PoJo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "librarybooking")
public class LibraryBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "bookid")
	@JsonManagedReference
	private LibraryBooks bookid;

	@ManyToOne
	@JoinColumn(name = "costumerid")
	@JsonManagedReference
	private LibraryCostumer costumerid;

	@Column(name = "loaned")
	private Date loaned;

	@Column(name = "returned")
	private Date returned;

	public LibraryBooking() {
	}

	public LibraryBooking(Integer id, LibraryBooks bookid, LibraryCostumer costumerid, Date loaned, Date returned) {
		this.id = id;
		this.bookid = bookid;
		this.costumerid = costumerid;
		this.loaned = loaned;
		this.returned = returned;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

package com.example.demo.pojo.input;

import com.example.demo.pojo.entity.Books;
import com.example.demo.pojo.entity.Costumer;

import java.awt.print.Book;
import java.sql.Date;

public class BookingInput {

    private Books bookid;
    private Costumer costumerid;
    private Date loaned;
    private Date returned;


    public BookingInput(Books bookid, Costumer costumerid, Date loaned, Date returned) {
        this.bookid = bookid;
        this.costumerid = costumerid;
        this.loaned = loaned;
        this.returned = returned;
    }

    public Books getBookid() {
        return bookid;
    }

    public void setBookid(Books bookid) {
        this.bookid = bookid;
    }

    public Costumer getCostumerid() {
        return costumerid;
    }

    public void setCostumerid(Costumer costumerid) {
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

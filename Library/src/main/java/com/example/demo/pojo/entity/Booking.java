package com.example.demo.pojo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "bookid")
    @JsonManagedReference
    private Books bookid;

    @ManyToOne
    @JoinColumn(name = "costumerid")
    @JsonManagedReference
    private Costumer costumerid;

    @Column(name = "loaned")
    private Date loaned;

    @Column(name = "returned")
    private Date returned;

    public Booking() {
    }

    public Booking(Integer id, Books bookid, Costumer costumerid, Date loaned, Date returned) {
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

package com.assignment6.MogtaBayLodgeV1.Reservation;
import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String roomSize;
    @Column(nullable = false)
    private int numGuests;
    @Column(nullable = false)
    private String checkInDate;
    @Column(nullable = false)
    private String checkOutDate;

    // Constructors, getters, setters, etc.
    public Reservation() {}

    public Reservation(String roomSize, int numGuests, String checkInDate, String checkOutDate) {
        this.roomSize = roomSize;
        this.numGuests = numGuests;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }


    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}

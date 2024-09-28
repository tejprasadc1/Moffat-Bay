package com.assignment6.MogtaBayLodgeV1.Reservation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "room")
public class Reservation {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email; // New field for email

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

    public Reservation(String email, String roomSize, int numGuests, String checkInDate, String checkOutDate) {
        this.email = email;
        this.roomSize = roomSize;
        this.numGuests = numGuests;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

}

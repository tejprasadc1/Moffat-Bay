package com.assignment6.MogtaBayLodgeV1.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Find a reservation by email and reservation ID
    Reservation findByEmailAndId(String email, Long reservationId);
}

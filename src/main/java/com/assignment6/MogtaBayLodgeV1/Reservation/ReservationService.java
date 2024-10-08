package com.assignment6.MogtaBayLodgeV1.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public Reservation findById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    // Method to find by email and reservation ID
    public Reservation findByEmailAndReservationId(String email, Long reservationId) {
        return reservationRepository.findByEmailAndId(email, reservationId);
    }
}

package com.assignment6.MogtaBayLodgeV1.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservation")
    public String showReservationPage(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "roomReservation";
    }

    @PostMapping("/reservation")
    public String submitReservation(@RequestParam("roomSize") String roomSize,
                                    @RequestParam("numGuests") int numGuests,
                                    @RequestParam("checkInDate") String checkInDate,
                                    @RequestParam("checkOutDate") String checkOutDate,
                                    Model model) {
        // Create reservation object and save it to the database
        Reservation reservation = new Reservation(roomSize, numGuests, checkInDate, checkOutDate);
        reservationService.saveReservation(reservation);

        model.addAttribute("reservation", reservation);
        return "reservationSummary";
    }

    // New method to handle /reservation/confirm
    @PostMapping("/reservation/confirm")
    public String confirmReservation(@RequestParam("reservationId") Long reservationId, Model model) {
        // Fetch reservation details based on reservationId (optional logic if needed)
        Reservation reservation = reservationService.findById(reservationId);
        if (reservation == null) {
            model.addAttribute("errorMessage", "Reservation not found.");
            return "errorPage"; // Create a custom error page if needed
        }

        // Logic for confirming the reservation (optional)

        model.addAttribute("reservation", reservation);
        return "reservationConfirmation"; // This should be your confirmation page
    }
}

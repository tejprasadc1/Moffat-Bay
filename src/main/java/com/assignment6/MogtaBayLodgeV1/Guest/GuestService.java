package com.assignment6.MogtaBayLodgeV1.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Guest registerGuest(Guest guest) {
        // Hash password before saving
        guest.setPassword(passwordEncoder.encode(guest.getPassword()));
        return guestRepository.save(guest);
    }

    public Optional<Guest> loginGuest(String email, String password) {
        Optional<Guest> guest = guestRepository.findByEmail(email);
        if (guest.isPresent() && passwordEncoder.matches(password, guest.get().getPassword())) {
            return guest;
        }
        return Optional.empty();
    }
}
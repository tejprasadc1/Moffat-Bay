package com.assignment6.MogtaBayLodgeV1.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("guest", new Guest());
        return "register";
    }

    @PostMapping("/register")
    public String registerGuest(@ModelAttribute Guest guest, Model model) {
        guestService.registerGuest(guest);
        model.addAttribute("successMessage", "Registration successful!");
        return "login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginGuest(@RequestParam String email, @RequestParam String password, Model model) {
        if (guestService.loginGuest(email, password).isPresent()) {
            return "dashboard";
        } else {
            model.addAttribute("errorMessage", "Invalid email or password.");
            return "login";
        }
    }
}
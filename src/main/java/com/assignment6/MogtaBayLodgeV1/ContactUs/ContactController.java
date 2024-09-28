package com.assignment6.MogtaBayLodgeV1.ContactUs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/submitContactForm")
    public String submitContactForm(@RequestParam("name") String name,
                                    @RequestParam("email") String email,
                                    @RequestParam("message") String message,
                                    Model model) {
        // Create a Contact object from form data
        Contact contact = new Contact(name, email, message);

        // Save contact message via service
        contactService.saveContactMessage(contact);

        // Add confirmation message to the model
        model.addAttribute("confirmationMessage", "Thank you for contacting us, " + name + ". We will get back to you shortly.");

        // Redirect to a confirmation page
        return "contactConfirmation";
    }
}

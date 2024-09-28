package com.assignment6.MogtaBayLodgeV1.ContactUs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Save contact message
    public void saveContactMessage(Contact contact) {
        contactRepository.save(contact);
    }
}

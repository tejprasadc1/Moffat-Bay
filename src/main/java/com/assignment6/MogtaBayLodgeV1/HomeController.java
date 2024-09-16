package com.assignment6.MogtaBayLodgeV1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/aboutus")
    public String aboutUs() {
        return "AboutUs";
    }

    @GetMapping("/contactus")
    public String contactus() {
        return "Contact";
    }

    @GetMapping("/attractions")
    public String attractions() {
        return "Attractions";
    }


}
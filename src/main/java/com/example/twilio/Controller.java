package com.example.twilio;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class Controller {

    @PostMapping("/notificacion")
    public String twilio() {
        return "Twilio";
    }

}


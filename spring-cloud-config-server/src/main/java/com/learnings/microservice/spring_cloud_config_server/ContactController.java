package com.learnings.microservice.spring_cloud_config_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    ContactConfiguration contactConfiguration;

    @GetMapping("/contact-info")
    public ContactConfiguration getContactInfo() {
        return contactConfiguration;
    }
}

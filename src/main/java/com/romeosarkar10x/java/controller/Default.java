package com.romeosarkar10x.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the Default controller for handling the root endpoint.
 */
@RestController
@RequestMapping("/")
public final class Default {
    /**
     * Handles the home endpoint.
     *
     * @return A greeting message.
     */
    @GetMapping
    public String home() {
        return "Hello World!";
    }
}

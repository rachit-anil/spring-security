package com.eazybytes.projectparadox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String get() {
        return "Home Details ";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "Home Details ";
    }
}

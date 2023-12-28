package com.example.demo.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp() {
        return "signUp Done.";
    }

    @GetMapping("/login")
    public String login() {
        return "login Done.";
    }
}

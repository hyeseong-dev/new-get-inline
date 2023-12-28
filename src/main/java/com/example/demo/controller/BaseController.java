package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/")
    public String root(){
        return "index";
    }
    @GetMapping("/error")
    public String error(){
        return "error";
    }
}

package com.vinith.mylearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IController {
    
    @GetMapping("/check")
    public String home() {
        return "Just empty";
    }
}

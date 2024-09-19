package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public float greet() {
        return (float) (8.7);
    }

    @RequestMapping("/about")
    public boolean about() {
        return true;
    }






}
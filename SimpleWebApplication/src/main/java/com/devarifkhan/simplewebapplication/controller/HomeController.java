package com.devarifkhan.simplewebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "/home"})
    public String displayHomePage(Model model) {
        model.addAttribute("username","arifkhan");
        return "home"; // Changed from "home.html" to "home"
    }
}

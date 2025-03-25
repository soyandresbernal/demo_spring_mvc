package com.springboot.data.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hi springboot");
        model.addAttribute("name", "andrés");
        model.addAttribute("lastname", "serious");
        return "details";
    }
}

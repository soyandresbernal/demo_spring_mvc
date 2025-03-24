package com.springboot.data.springdemo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        model.put("title", "Hi springboot");
        model.put("name", "andrés");
        model.put("lastname", "serious");
        return "details";
    }
}

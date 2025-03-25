package com.springboot.data.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.data.springdemo.models.User;
import com.springboot.data.springdemo.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        UserDto userDto = new UserDto();
        User user = new User("Andrés", "Serious");
        userDto.setUser(user);
        userDto.setTitle("Hi Spring");
        return userDto;
    }
}

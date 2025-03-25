package com.springboot.data.springdemo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/list")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    public List<User> list() {
        User user = new User("Andrés", "Serious");
        User user2 = new User("Juan", "Serious");
        User user3 = new User("Dalo", "Serious");

        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }
}

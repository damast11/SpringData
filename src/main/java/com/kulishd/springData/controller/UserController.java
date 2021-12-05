package com.kulishd.springData.controller;

import java.util.List;

import com.kulishd.springData.entity.User;
import com.kulishd.springData.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{name}")
    public User findUserByName(String name) {
        return userService.findUserByName(name);
    }
}

package com.kulishd.springData.service;

import java.util.List;

import com.kulishd.springData.entity.User;

public interface UserService {
    List<User> findAllUsers();

    User findUserByName(String name);

    User saveUser(User user);
}

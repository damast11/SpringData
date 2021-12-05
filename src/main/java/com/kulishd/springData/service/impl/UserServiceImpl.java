package com.kulishd.springData.service.impl;

import java.util.List;
import javax.transaction.Transactional;

import com.kulishd.springData.entity.User;
import com.kulishd.springData.repository.UserRepository;
import com.kulishd.springData.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findByName(name).orElse(null);
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

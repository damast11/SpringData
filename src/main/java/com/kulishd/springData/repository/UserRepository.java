package com.kulishd.springData.repository;

import java.util.Optional;

import com.kulishd.springData.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);
}

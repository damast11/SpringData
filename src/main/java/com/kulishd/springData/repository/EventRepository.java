package com.kulishd.springData.repository;

import java.util.Optional;

import com.kulishd.springData.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Optional<Event> findByName(String name);
}

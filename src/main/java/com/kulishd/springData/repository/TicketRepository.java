package com.kulishd.springData.repository;

import java.util.List;
import java.util.Optional;

import com.kulishd.springData.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    Optional<Ticket> findByCode(String code);

    List<Ticket> findByEventNameAndIsAvailableTrue(String eventName);
}

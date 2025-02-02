package com.dmtr.stoken.domain.repositories;

import com.dmtr.stoken.application.abstractions.event.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<AbstractEvent, UUID> {
}

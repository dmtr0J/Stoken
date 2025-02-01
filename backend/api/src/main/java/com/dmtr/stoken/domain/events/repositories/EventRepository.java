package com.dmtr.stoken.domain.events.repositories;

import com.dmtr.stoken.domain.events.BaseEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<BaseEvent, UUID> {
}

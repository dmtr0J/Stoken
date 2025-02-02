package com.dmtr.stoken.application.services;

import com.dmtr.stoken.application.abstractions.event.AbstractEvent;
import com.dmtr.stoken.application.abstractions.event.Event;
import com.dmtr.stoken.domain.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager = "eventTransactionManager", readOnly = true)
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    @Transactional(transactionManager = "eventTransactionManager")
    public Event addEvent(AbstractEvent event) {
        return eventRepository.save(event);
    }
}

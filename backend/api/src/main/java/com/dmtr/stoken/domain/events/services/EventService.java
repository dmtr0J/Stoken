package com.dmtr.stoken.domain.events.services;

import com.dmtr.stoken.domain.events.BaseEvent;
import com.dmtr.stoken.domain.events.Event;
import com.dmtr.stoken.domain.events.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager = "eventTransactionManager", readOnly = true)
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    @Transactional(transactionManager = "eventTransactionManager")
    public Event addEvent(BaseEvent event) {
        return eventRepository.save(event);
    }
}

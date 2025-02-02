package com.dmtr.stoken.application.user.events;

import com.dmtr.stoken.application.abstractions.event.AbstractEvent;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@Entity
@ToString(callSuper = true)
@DiscriminatorValue(UserCreatedEvent.TYPE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserCreatedEvent extends AbstractEvent {

    public static final String TYPE = "user-created";

    public UserCreatedEvent(String aggregateId, Instant timestamp, String userId, Long revision, String data) {
        super(aggregateId, timestamp, userId, revision, data);
    }

}


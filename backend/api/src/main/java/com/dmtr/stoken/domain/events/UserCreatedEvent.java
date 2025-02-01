package com.dmtr.stoken.domain.events;

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
public class UserCreatedEvent extends BaseEvent {

    public static final String TYPE = "user-created";

    public UserCreatedEvent(String aggregateId, Instant timestamp, String userId, Long revision, String data) {
        super(aggregateId, timestamp, userId, revision, data);
    }

}


package com.dmtr.stoken.application.abstractions.event;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Table(name = "events")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class AbstractEvent implements Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotBlank(message = "Aggregate ID cannot be blank")
    @Size(max = 255, message = "Aggregate ID must not exceed 255 characters")
    @Column(name = "aggregate_id", nullable = false)
    private String aggregateId;

    @NotNull(message = "Timestamp is required")
    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;

    @NotBlank(message = "User ID cannot be blank")
    @Size(max = 255, message = "User ID must not exceed 255 characters")
    @Column(name = "user_id", nullable = false)
    private String userId;

    @NotNull(message = "Revision number is required")
    @Min(value = 1, message = "Revision must be at least 1")
    @Column(name = "revision", nullable = false)
    private Long revision;

    @NotBlank(message = "Event data cannot be blank")
    @Column(name = "data", nullable = false, columnDefinition = "jsonb")
    private String data;

    public AbstractEvent(String aggregateId, Instant timestamp, String userId, Long revision, String data) {
        this.aggregateId = aggregateId;
        this.timestamp = timestamp;
        this.userId = userId;
        this.revision = revision;
        this.data = data;
    }
}

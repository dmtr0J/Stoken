package com.dmtr.stoken.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotBlank(message = "Username is required.")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters.")
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @NotBlank(message = "Password is required.")
    @Size(min = 8, message = "Password must be at least 8 characters long.")
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank(message = "Email is required.")
    @Email(message = "Email should be valid.")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotNull(message = "Role is required.")
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Size(max = 100, message = "First name must not exceed 100 characters.")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Size(max = 100, message = "Last name must not exceed 100 characters.")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Size(max = 255, message = "Avatar URL must not exceed 255 characters.")
    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}





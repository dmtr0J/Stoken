package com.dmtr.stoken.domain.repositories;

import com.dmtr.stoken.domain.entities.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> getUserByUsername(@NotBlank(message = "Username is required.") @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters.") String username);

    boolean existsByUsername(@NotBlank(message = "Username is required.") @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters.") String username);

    boolean existsByEmail(@NotBlank(message = "Email is required.") @Email(message = "Email should be valid.") String email);

    Optional<User> findByUsername(@NotBlank(message = "Username is required.") @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters.") String username);
}

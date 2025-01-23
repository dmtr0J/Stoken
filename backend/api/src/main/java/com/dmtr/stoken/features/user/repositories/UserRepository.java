package com.dmtr.stoken.features.user.repositories;

import com.dmtr.stoken.domain.entities.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(@NotBlank(message = "Username is required.") @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters.") String username);
}

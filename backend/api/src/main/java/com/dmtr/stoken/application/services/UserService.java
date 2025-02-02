package com.dmtr.stoken.application.services;

import com.dmtr.stoken.domain.entities.User;
import com.dmtr.stoken.domain.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Service
@Transactional(transactionManager = "readTransactionManager", readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User getByUsername(String username) {
        return userRepository.getUserByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }
}

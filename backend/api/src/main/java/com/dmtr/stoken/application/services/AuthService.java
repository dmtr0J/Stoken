package com.dmtr.stoken.application.services;

import com.dmtr.stoken.domain.entities.User;
import com.dmtr.stoken.infrastructure.security.jwt.JWTUtil;
import com.dmtr.stoken.domain.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JWTUtil jwtUtil;
    private final UserRepository userRepository;

    public void register(@Valid User user) {
        if (userRepository.existsByUsername(user.getUsername()) || userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public String login(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isEmpty() || !passwordEncoder.matches(password, userOptional.get().getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        return jwtUtil.generateToken(username);
    }
}

package com.dmtr.stoken.presentation.controllers;

import com.dmtr.stoken.domain.entities.User;
import com.dmtr.stoken.presentation.dto.LoginRequest;
import com.dmtr.stoken.application.services.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody @Valid User user) {
        authService.register(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest.getUsername(), loginRequest.getPassword());
    }

}

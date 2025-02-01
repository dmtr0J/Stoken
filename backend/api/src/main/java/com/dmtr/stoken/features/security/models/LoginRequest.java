package com.dmtr.stoken.features.security.models;

import lombok.Getter;

@Getter
public class LoginRequest {
    String username;
    String password;
}

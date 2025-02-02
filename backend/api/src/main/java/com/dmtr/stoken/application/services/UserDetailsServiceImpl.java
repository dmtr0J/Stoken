package com.dmtr.stoken.application.services;

import com.dmtr.stoken.domain.entities.User;
import com.dmtr.stoken.domain.entities.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug("PreLoad");
        User user = userService.getByUsername(username);
        log.debug("Loading user {}", username);

        return new UserDetailsImpl(
                user.getUsername(),
                user.getPassword(),
                Set.of(new SimpleGrantedAuthority(user.getRole().name()))
        );
    }
}

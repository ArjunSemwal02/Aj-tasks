package com.japps.tasks.auth;

import com.japps.tasks.domain.entities.Role;
import com.japps.tasks.domain.entities.User;
import com.japps.tasks.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(RegisterRequestDto request) {

        if (userRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("Email already registered");
        }

        User user = new User();

        user.setName(request.name());
        user.setEmail(request.email());

        // NEVER save the raw password
        user.setPassword(
                passwordEncoder.encode(request.password())
        );

        user.setRole(Role.USER);

        userRepository.save(user);
    }
}
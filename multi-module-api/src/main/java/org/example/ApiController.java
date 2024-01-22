package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
public class ApiController {

    private static final String EMAIL = "email@gmail.com";
    private static final String PASSWORD = "password";

    private final UserRepository userRepository;

    @PostMapping("/sign-up")
    public void signUp() {
        userRepository.save(new User(EMAIL, PASSWORD));
    }
}
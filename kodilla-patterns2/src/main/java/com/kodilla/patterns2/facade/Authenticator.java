package com.kodilla.patterns2.facade;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticator(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }
}

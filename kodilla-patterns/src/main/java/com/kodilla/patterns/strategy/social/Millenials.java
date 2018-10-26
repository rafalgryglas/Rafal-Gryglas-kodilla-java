package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}

package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("millenialUser");
        User yGen = new YGeneration("yGenUser");
        User zGen = new ZGeneration("zGenUser");

        // When & Then
        assertEquals("sharing via twitter", millenial.sharePost());
        assertEquals("sharing via facebook", yGen.sharePost());
        assertEquals("sharing via snapchat", zGen.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User millenial = new Millenials("millenialUser");

        // When
        millenial.setSocialPublisher(new TwitterPublisher());

        // Then
        assertEquals("sharing via twitter", millenial.sharePost());
    }
}

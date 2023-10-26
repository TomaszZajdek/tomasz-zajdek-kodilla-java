package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {
    @Test
    void probablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1));
    }
}

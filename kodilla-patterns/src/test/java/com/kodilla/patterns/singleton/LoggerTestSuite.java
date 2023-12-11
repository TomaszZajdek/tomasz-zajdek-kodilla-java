package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    void getLastLogTest() {
        //given
        Logger logger = Logger.INSTANCE;
        logger.log("Test");
        //when
        String testLog = logger.getLastLog();
        //then
        Assertions.assertEquals(testLog, "Test");
    }
}

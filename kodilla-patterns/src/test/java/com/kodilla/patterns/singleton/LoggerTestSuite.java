package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void openSettingsLogger() {
        logger = Logger.LOGGER;
        logger.openLogger("myapp.logger");
    }

    @AfterAll
    public static void closeSettingLogger() {
        logger.closeLogger();
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Opened: " + lastLog);
        //Then
        assertEquals("myapp.logger", lastLog);
    }

    @Test
    void testLoadLogger() {
        //Given
        //When
        boolean result = logger.loadLogger();
        //Then
        assertTrue(result);
    }
}

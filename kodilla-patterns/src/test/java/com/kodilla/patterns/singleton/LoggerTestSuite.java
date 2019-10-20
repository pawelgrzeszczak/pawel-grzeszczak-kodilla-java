package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("logs logs logs");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String logName = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + logName);
        //Then
        Assert.assertEquals("logs logs logs", logName);
    }
}
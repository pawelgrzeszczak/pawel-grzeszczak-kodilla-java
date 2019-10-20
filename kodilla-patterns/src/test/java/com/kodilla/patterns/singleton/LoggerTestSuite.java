package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("logs logs logs");
//        logger = new Logger();
//        logger.log("logs logs logs");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
//        String logName = logger.getLastLog();
        String logName = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + logName);
        //Then
        Assert.assertEquals("logs logs logs", logName);
    }
}






//   1. Utwórz w katalogu src/test/java w pakiecie com.kodilla.patterns.singleton nowy zestaw testów o nazwie LoggerTestSuite,
//    a w nim testy sprawdzające działanie metody getLastLog() klasy Logger. Aby to przetestować,
//    zapisz coś wcześniej do logów przy pomocy metody log(String log).
//        2. Zmodyfikuj kod klasy Logger tak, aby była zgodna ze wzorcem Singleton.
//        3. Zmodyfikuj napisane przed chwilą testy tak, aby uwzględniały zmiany w klasie Logger.
//        4. Utworzony kod prześlij do repozytorium GitHub.

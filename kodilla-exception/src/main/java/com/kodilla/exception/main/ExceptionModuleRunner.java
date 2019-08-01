package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

//        FileReader fileReader = new FileReader();
//        fileReader.readFile();

//        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
//        fileReader.readFile();

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        SecondChallenge secondChallenge = new SecondChallenge();

        String s = secondChallenge.probablyIWillThrowException(2, 1);
        System.out.println("Result: " + s);

    }
}

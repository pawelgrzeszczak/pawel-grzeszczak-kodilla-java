//package com.kodilla.testing;
//
//import com.kodilla.testing.calculator.Calculator;
//import com.kodilla.testing.user.SimpleUser;
//
//public class TestingMain {
//    public static void main(String[] args){
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")){
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
//
//        // tu umieść kolejny test ->
//        System.out.println("\nTest - pierwszy test jednostkowy:");
//
//        Calculator calc = new Calculator();
//
//        int resultAdd = 10;
//        int resultSubtract = 0;
//
//        if(resultAdd == calc.add(5, 5)){
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
//
//        if(resultSubtract == calc.subtract(5, 5)){
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
//
//    }
//}
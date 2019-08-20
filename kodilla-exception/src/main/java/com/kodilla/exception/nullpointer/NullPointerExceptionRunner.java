package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        //User user = new User("Janek");
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
//            System.out.println("Message is not send," +
//                    "but my program still running very well!" + e);
            System.out.println(e);
        }

        System.out.println("Processing other logic!");
    }
}
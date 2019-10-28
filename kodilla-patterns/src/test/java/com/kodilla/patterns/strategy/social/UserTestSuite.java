package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Millenials");
        User user2 = new YGeneration("YGeneration");
        User user3 = new ZGeneration("ZGeneration");
        //When
        String user1SharePost = user1.sharePost();
        System.out.println("User1 share post: " + user1SharePost);
        String user2SharePost = user2.sharePost();
        System.out.println("User2 share post: " + user2SharePost);
        String user3SharePost = user3.sharePost();
        System.out.println("User3 share post: " + user3SharePost);
        //Then
        Assert.assertEquals("Snapchat", user1SharePost);
        Assert.assertEquals("Facebook", user2SharePost);
        Assert.assertEquals("Twitter", user3SharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Millenials");
        //When
        String user1SharePost = user1.sharePost();
        System.out.println("User1 share post: " + user1SharePost);
        user1.setSocialPublisher(new TwitterPublisher());
        user1SharePost = user1.sharePost();
        System.out.println("User1 share post: " + user1SharePost);
        //Then
        Assert.assertEquals("Twitter", user1SharePost);
    }
}
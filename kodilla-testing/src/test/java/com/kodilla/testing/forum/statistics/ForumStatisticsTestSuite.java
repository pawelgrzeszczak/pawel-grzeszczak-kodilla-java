package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Before
    public void before(){
        System.out.println("New test: ");
    }

    // gdy liczba postów = 0
    // gdy liczba komentarzy = 0
    // gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatistics0posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        double avgCommentsPerUsers = forumStatistics.getAvgCommentsPerUsers();
        double avgCommentsPerPosts = forumStatistics.getAvgCommentsPerPosts();

        //Then
        assertEquals(0, avgPostsPerUser,0);
        assertEquals(0, avgCommentsPerUsers,0);
        assertEquals(0, avgCommentsPerPosts,0);
    }

    //gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatistics1000posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("User " + 1);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        double avgCommentsPerUsers = forumStatistics.getAvgCommentsPerUsers();
        double avgCommentsPerPosts = forumStatistics.getAvgCommentsPerPosts();

        //Then
        assertEquals(10, avgPostsPerUser, 0);
        assertEquals(0.5, avgCommentsPerUsers, 0);
        assertEquals(0.05, avgCommentsPerPosts, 0);
    }

    // gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateAdvStatisticsWhenPostsMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("User " + 1);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        double avgCommentsPerUsers = forumStatistics.getAvgCommentsPerUsers();
        double avgCommentsPerPosts = forumStatistics.getAvgCommentsPerPosts();

        //Then
        assertEquals(1, avgPostsPerUser,0);
        assertEquals(0.5, avgCommentsPerUsers, 0);
        assertEquals(0.5, avgCommentsPerPosts, 0);
    }

    // gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("User " + 1);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        double avgCommentsPerUsers = forumStatistics.getAvgCommentsPerUsers();
        double avgCommentsPerPosts = forumStatistics.getAvgCommentsPerPosts();

        //Then
        assertEquals(0.5, avgPostsPerUser,0);
        assertEquals(1, avgCommentsPerUsers, 0);
        assertEquals(2, avgCommentsPerPosts, 0);
    }

    // gdy liczba użytkowników = 100
    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("User " + 1);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        double avgCommentsPerUsers = forumStatistics.getAvgCommentsPerUsers();
        double avgCommentsPerPosts = forumStatistics.getAvgCommentsPerPosts();

        //Then
        assertEquals(0, avgPostsPerUser,0);
        assertEquals(0, avgCommentsPerUsers, 0);
        assertEquals(0, avgCommentsPerPosts, 0);
    }
}

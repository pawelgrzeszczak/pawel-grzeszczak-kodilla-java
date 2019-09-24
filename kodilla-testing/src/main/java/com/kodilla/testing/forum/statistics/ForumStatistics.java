package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUsers;
    private double avgCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if(numberOfUsers == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUsers = 0;
        } else {
            avgPostsPerUser = (double)numberOfPosts / (double)numberOfUsers;
            avgCommentsPerUsers = (double)numberOfComments / (double)numberOfUsers;
        }

        if(numberOfPosts == 0) {
            avgCommentsPerPosts = 0;
        } else {
            avgCommentsPerPosts = (double)numberOfComments / (double)numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Liczba użytkowników: " + numberOfUsers);
        System.out.println("Liczba postów: " + numberOfPosts);
        System.out.println("Liczba komentarzy: " + numberOfComments);
        System.out.println("Średnia liczba postów na użytkownika: " + avgPostsPerUser);
        System.out.println("średnia liczba komentarzy na użytkownika: " + avgCommentsPerUsers);
        System.out.println("Średnia liczba komentarzy na post: " + avgCommentsPerPosts);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUsers() {
        return avgCommentsPerUsers;
    }

    public double getAvgCommentsPerPosts() {
        return avgCommentsPerPosts;
    }
}

package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    int usersNumber;
    int postsNumber;
    int commentsNumber;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;
    public void calculateAdvStatistics(Statistics statistics) {
        postsNumber = statistics.postsCount();
        usersNumber = statistics.usersNames().size();
        commentsNumber = statistics.commentsCount();
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost =(double) commentsNumber / postsNumber;
        } else {
            averageCommentsPerPost = 0;
        }
        if (statistics.usersNames().size() != 0) {
            averageCommentsPerUser =(double) commentsNumber / usersNumber;
        } else {
            averageCommentsPerUser = 0;
        }
        if (statistics.usersNames().size() != 0) {
            averagePostsPerUser = (double) postsNumber / usersNumber;
        } else {
            averagePostsPerUser = 0;
        }
    }
    public void showStatistics() {
        System.out.println("Users number : " + usersNumber);
        System.out.println("Comments number : " + commentsNumber);
        System.out.println("Posts number : " + postsNumber);
        System.out.println("Average comments per post number : " + averageCommentsPerPost);
        System.out.println("Average comments per user : " + averageCommentsPerUser);
        System.out.println("Average posts per user : " + averagePostsPerUser);
    }
}

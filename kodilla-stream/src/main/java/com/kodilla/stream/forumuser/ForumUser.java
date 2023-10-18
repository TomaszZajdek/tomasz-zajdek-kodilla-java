package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int postsCount;

    public ForumUser(final int userId, final String username, final char gender, final LocalDate dateOfBirth, final int postsCount) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postsCount = postsCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postsCount=" + postsCount +
                '}';
    }
}

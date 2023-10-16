package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @BeforeEach
    public void setUpForumUser() {
        forumStatistics = new ForumStatistics();
    }

    private List<String> generateUsersList(int usersQuantity) {
        List<String> listOfUsers = new ArrayList<>();
        for(int i = 1; i <= usersQuantity; i++) {
            listOfUsers.add("Adam" + i);
        }
        return listOfUsers;
    }
    @Test
    void testCalculateAdvStatisticsZeroPosts() {
        //Given
        ForumUser forumUser = new ForumUser("s","Stefan");
        when(statisticsMock.postsCount()).thenReturn(forumUser.getPostsQuantity());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getPostsNumber());

    }
    @Test
    void testCalculateAdvStatisticsThousandPosts() {
        //Given
        ForumUser forumUser = new ForumUser("s","Stefan");
        for(int i = 0; i < 1000; i++) {
            forumUser.addPost("Stefan", "P"+i);
        }
        when(statisticsMock.postsCount()).thenReturn(forumUser.getPostsQuantity());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getPostsNumber());
    }
    @Test
    void testCalculateAdvStatisticsZeroComments() {
        //Given
        ForumUser forumUser = new ForumUser("s","Stefan");
        when(statisticsMock.commentsCount()).thenReturn(forumUser.getCommentsQuantity());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getCommentsNumber());
    }
    @Test
    void testCalculateAdvStatisticsLessCommentsThenPosts() {
        //Given
        ForumUser forumUser = new ForumUser("s","Stefan");
        ForumPost forumPost = new ForumPost("ss","ss");
        for(int i = 0; i < 154; i++) {
            forumUser.addPost("Stefan", "P"+i);
        }
        for(int i = 0; i < 153; i++) {
            forumUser.addComment(forumPost, "ss","ssss");
        }
        when(statisticsMock.commentsCount()).thenReturn(forumUser.getCommentsQuantity());
        when(statisticsMock.postsCount()).thenReturn(forumUser.getPostsQuantity());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(forumStatistics.getAverageCommentsPerPost() < 1);

    }
    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        ForumUser forumUser = new ForumUser("s","Stefan");
        ForumPost forumPost = new ForumPost("ss","ss");
        for(int i = 0; i < 152; i++) {
            forumUser.addPost("Stefan", "P"+i);
        }
        for(int i = 0; i < 153; i++) {
            forumUser.addComment(forumPost, "ss","ssss");
        }
        when(statisticsMock.commentsCount()).thenReturn(forumUser.getCommentsQuantity());
        when(statisticsMock.postsCount()).thenReturn(forumUser.getPostsQuantity());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(forumStatistics.getAverageCommentsPerPost() > 1);

    }
    @Test
    void testCalculateAdvStatisticsZeroUsers() {
        //Given
        List<String> usersList = generateUsersList(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getUsersNumber());
    }
    @Test
    void  testCalculateAdvStatisticsHundredUsers() {
        //Given
        List<String> usersList = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistics.getUsersNumber());
    }
}
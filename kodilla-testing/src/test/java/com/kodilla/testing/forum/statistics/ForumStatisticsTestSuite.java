package com.kodilla.testing.forum.statistics;

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
        int postsNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getPostsNumber());

    }
    @Test
    void testCalculateAdvStatisticsThousandPosts() {
        //Given
        int postsNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getPostsNumber());
    }
    @Test
    void testCalculateAdvStatisticsZeroComments() {
        //Given
        int commentsNum = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsNum);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getCommentsNumber());
    }
    @Test
    void testCalculateAdvStatisticsLessCommentsThenPosts() {
        //Given
        int postsNum = 154;
        int commentsNum = 143;
        when(statisticsMock.commentsCount()).thenReturn(commentsNum);
        when(statisticsMock.postsCount()).thenReturn(postsNum);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(forumStatistics.getAverageCommentsPerPost() < 1);

    }
    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        int postNum = 100;
        int commentsNum = 444;
        when(statisticsMock.postsCount()).thenReturn(postNum);
        when(statisticsMock.commentsCount()).thenReturn(commentsNum);
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

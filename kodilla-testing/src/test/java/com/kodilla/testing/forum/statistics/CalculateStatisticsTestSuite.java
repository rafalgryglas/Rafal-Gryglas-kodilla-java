package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private static int counterTests = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("All tests started");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests finished");
    }

    @Before
    public void beforeTest() {
        counterTests++;
        System.out.println("Test number #" + counterTests);
    }

    @Test
    //gdy liczba postów = 0
    public void testZeroPost() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("rafal" + i);
        }
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 0;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 50;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(0, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(50, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(10, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(0, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(5, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }

    @Test
    //gdy liczba postów = 1000
    public void testPostNumber1000() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("rafal" + i);
        }
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 1000;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 50;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(50, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(10, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(100, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(5, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(0.05, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }

    @Test
    //gdy liczba komentarzy = 0
    public void testZeroComments() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("rafal" + i);
        }
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 1000;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 0;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(0, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(10, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(100, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }

    @Test
    //gdy liczba komentarzy < liczba postów
    public void testCommentsLessPosts() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("rafal" + i);
        }
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 1000;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 500;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(500, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(10, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(100, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(50, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(0.5, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }

    @Test
    //gdy liczba komentarzy > liczba postów
    public void testCommentsMoreThenPosts() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("rafal" + i);
        }
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 1000;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 2000;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(2000, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(10, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(100, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(200, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(2, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }

    @Test
    //gdy liczba użytkowników =0
    public void testZeroUsers() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 1000;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 2000;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(2000, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(0, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(0, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(2, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }

    @Test
    //gdy liczba użytkowników = 100
    public void testUsersNumbers100() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("rafal" + i);
        }
        when(statisticMock.usersNames()).thenReturn(usersNames);
        int posts = 1000;
        when(statisticMock.postsCount()).thenReturn(posts);
        int comments = 2000;
        when(statisticMock.commentsCount()).thenReturn(comments);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticMock);
        calculateStatistics.showStatistic();
        //Then
        assertEquals(1000, calculateStatistics.getNumberOfPosts(), 0.001);
        assertEquals(2000, calculateStatistics.getNumberOfComments(), 0.001);
        assertEquals(100, calculateStatistics.getNumberOfUsers(), 0.001);
        assertEquals(10, calculateStatistics.getAverageNumberOfPostsForUsers(), 0.001);
        assertEquals(20, calculateStatistics.getAverageNumberOfCommentsForUsers(), 0.001);
        assertEquals(2, calculateStatistics.getAverageNumberOfCommentsForPosts(), 0.001);
    }
}




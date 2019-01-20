package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KodillaQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework homework1 = new Homework(20.1, "Facade");
        Homework homework2 = new Homework(20.2, "Decorator");
        Homework homework3 = new Homework(20.3, "Spring-AOP");
        Homework homework4 = new Homework(20.4, "Observer");
        Homework homework5 = new Homework(19.1, "Spring WEB 2");
        Homework homework6 = new Homework(18.3, "Spring WEB");

        KodillaMentor mentor1 = new KodillaMentor("Mentor 1");
        KodillaMentor mentor2 = new KodillaMentor("Mentor 2");

        KodillaUser rGryglas = new KodillaUser("Rafał", "Gryglas");
        KodillaUser jSmith = new KodillaUser("John", "Smith");
        KodillaUser iEscobar = new KodillaUser("Ivone", "Escobar");

        HomeworkQueue queue1 = new HomeworkQueue(1, rGryglas);
        HomeworkQueue queue2 = new HomeworkQueue(2, jSmith);
        HomeworkQueue queue3 = new HomeworkQueue(1, iEscobar);

        queue1.registerObserver(mentor1);
        queue2.registerObserver(mentor1);
        queue3.registerObserver(mentor2);

        //When
        queue1.addHomeworkToQueue(homework1);
        queue1.addHomeworkToQueue(homework2);
        queue2.addHomeworkToQueue(homework1);
        queue2.addHomeworkToQueue(homework3);
        queue3.addHomeworkToQueue(homework4);
        queue3.addHomeworkToQueue(homework6);
        queue1.addHomeworkToQueue(homework5);
        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());

    }
}

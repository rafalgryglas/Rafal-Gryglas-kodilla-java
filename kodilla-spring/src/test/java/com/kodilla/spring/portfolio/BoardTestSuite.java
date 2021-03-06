package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().getTasks().add("Done List");
        board.getInProgressList().getTasks().add("In Progress List");
        board.getToDoList().getTasks().add("To Do List");

        String doneList = board.getDoneList().getTasks().get(0);
        String inProgress = board.getInProgressList().getTasks().get(0);
        String toDo = board.getToDoList().getTasks().get(0);

        //Then
        Assert.assertEquals("Done List", doneList);
        Assert.assertEquals("In Progress List", inProgress);
        Assert.assertEquals("To Do List", toDo);
    }
}
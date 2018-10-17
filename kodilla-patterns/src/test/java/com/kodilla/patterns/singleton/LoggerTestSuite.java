package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void newLogTest() {

    }
    @Test
    public void testGetLog() {
        //Given
        Logger.getInstance().log("This is first log");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("This is first log",result);
    }
}

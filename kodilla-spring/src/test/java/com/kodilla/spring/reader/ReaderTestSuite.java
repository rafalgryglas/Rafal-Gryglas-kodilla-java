package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    public void testReader() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
        //When&Then
        reader.read();
    }
    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        boolean book2Rxists = context.containsBean("book2");
        //Then
        System.out.println("Bean book2 was found in the container: "+book2Rxists);
    }
}

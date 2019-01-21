package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Shirley Hazzard", "The Great Fire", 2003, "HS"));
        bookSet.add(new Book("Cormac McCarthy", "Road", 2006, "MC"));
        bookSet.add(new Book("Michał Szafrański", "Finansowy ninja", 2016, "SM"));
        bookSet.add(new Book("J.R.R Tolkien", "The Lord of the Rings", 2000, "TJ"));
        bookSet.add(new Book("Orwell George", "Rok 1984", 1980, "GO"));
        //When
        int medianResult = medianAdapter.publicationYearMediana(bookSet);
        //Then
        Assert.assertEquals(2003, medianResult);

    }
}

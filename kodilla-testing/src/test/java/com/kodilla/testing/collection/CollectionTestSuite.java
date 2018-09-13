package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    public static ArrayList<Integer> arrayListExample() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            arrayList1.add(i);
        }
        return arrayList1;
    }
    @Before
    public void before() {
        System.out.println("List test begin");
    }
    @After
    public void after() {
        System.out.println("Test end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //sprawdzi, czy klasa zachowuje się poprawnie, gdy lista jest pusta
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator(); //nowa ArreyList OddNumbersExterminator
        ArrayList<Integer> list1 = new ArrayList<>(); //pusta ArrayList
        //When
        ArrayList<Integer> result1 = oddNumbers.exterminate(list1);
        //Then
        Assert.assertEquals(0, result1.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //sprawdzi, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator(); //nowa ArreyList OddNumbersExterminator
        ArrayList<Integer> list2 = arrayListExample(); //lista stworzona metoda "someArrayList"
        //When
        ArrayList<Integer> result2 = oddNumbers.exterminate(list2); //result zawierajacy liczby parzyste wybrane z list2
        //Then
        Assert.assertEquals(15, result2.size()); // Oczekiwanie 15 pozycji, sprawdzenie z wielkością utworzonej
    }
}
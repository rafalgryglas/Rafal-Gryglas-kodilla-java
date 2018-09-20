package com.kodilla.stream.world;

import org.junit.*;
import org.junit.Test;
import java.math.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent africa = new Continent("Africa");
        africa.addCountryToContinent(new Country("Nigeria",new BigDecimal("190632261")));
        africa.addCountryToContinent(new Country("Egipt", new BigDecimal("97041072")));
        africa.addCountryToContinent(new Country("Kenia", new BigDecimal("47615739")));
        Continent asia = new Continent("Asia");
        asia.addCountryToContinent(new Country("Rosia", new BigDecimal("142257519")));
        asia.addCountryToContinent(new Country("China", new BigDecimal("1379302771")));
        asia.addCountryToContinent(new Country("Indie", new BigDecimal("1281935911")));
        Continent europe = new Continent("Europe");
        europe.addCountryToContinent(new Country("Poland", new BigDecimal("38476269")));
        europe.addCountryToContinent(new Country("Spain", new BigDecimal("48958159")));
        europe.addCountryToContinent(new Country("Germany", new BigDecimal("80594017")));

        World world = new World();
        world.addContinentToWorld(africa);
        world.addContinentToWorld(asia);
        world.addContinentToWorld(europe);
        //When
        BigDecimal result = new BigDecimal("3306813718"); //excel
        BigDecimal totalPeopleOnTheWorld = world.getPeopleQantity();
        //Then
        assertEquals(result, totalPeopleOnTheWorld);
    }
}
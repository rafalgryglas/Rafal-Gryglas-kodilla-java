package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),theCost);
    }
    @Test
    public void theBasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }
    @Test
    public void testPizzaWithExtraCheeseAndPeperoniGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21),theCost);
    }
    @Test
    public void testPizzaWithExtraCheeseAndPeperoniGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + mozzarella + pepperoni sausage", description);
    }
    @Test
    public void testLargePizzaWithExtraCheesePeperoniMushroomsRedOnionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new RedOnionDecorator(theOrder);
        theOrder = new LargeSizeDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32),theCost);
    }
    @Test
    public void testLargePizzaWithExtraCheesePeperoniMushroomsRedOnionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new RedOnionDecorator(theOrder);
        theOrder = new LargeSizeDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Large Pizza with tomato sauce and cheese + mozzarella + pepperoni sausage + mushrooms" +
                " + red onion", description);
    }
}

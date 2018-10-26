package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.ROLL_WITH_SESAME)
                .burgers(2)
                .sauce(Sauce.BBQ)
                .ingredients(Ingredients.CUCUMBER)
                .ingredients(Ingredients.PRAWN)
                .ingredients(Ingredients.CHEESE)
                .ingredients(Ingredients.LETTUCE)
                .builder();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4,howManyIngredients);
    }
}

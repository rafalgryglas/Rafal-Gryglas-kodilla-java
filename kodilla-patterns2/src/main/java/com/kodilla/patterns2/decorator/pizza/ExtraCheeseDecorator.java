package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    public ExtraCheeseDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        //extra mozzarella
        return super.getCost().add(new BigDecimal(3));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + mozzarella";
    }
}

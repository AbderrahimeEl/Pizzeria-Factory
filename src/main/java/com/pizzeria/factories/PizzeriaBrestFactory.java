package com.pizzeria.factories;

import com.pizzeria.pizzas.Pizza;
import com.pizzeria.pizzas.PizzaFromageBrest;
import com.pizzeria.pizzas.PizzaFruitsDeMerBrest;

public class PizzeriaBrestFactory implements PizzaFactory {
    @Override
    public Pizza créerPizza(String type) {
        if (type.equals("fromage")) {
            return new PizzaFromageBrest();
        } else if (type.equals("fruitsDeMer")) {
            return new PizzaFruitsDeMerBrest();
        }
        return null;
    }
}

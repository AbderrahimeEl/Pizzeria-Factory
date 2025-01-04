package com.pizzeria.factories;

import com.pizzeria.pizzas.Pizza;

public interface PizzaFactory {
    Pizza créerPizza(String type);
}
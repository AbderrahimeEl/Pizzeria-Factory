package com.pizzeria;

import com.pizzeria.pizzas.Pizza;

public abstract class Pizzeria {
    protected abstract Pizza créerPizza(String type);

    public Pizza commanderPizza(String type) {
        Pizza pizza = créerPizza(type);
        if (pizza != null) {
            pizza.préparer();
            pizza.cuire();
            pizza.couper();
            pizza.emballer();
        }
        return pizza;
    }
}

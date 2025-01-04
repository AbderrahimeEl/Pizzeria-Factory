package com.pizzeria;


import com.pizzeria.factories.PizzaFactory;
import com.pizzeria.pizzas.Pizza;

public class PizzeriaBrest extends Pizzeria {
    private PizzaFactory fabrique;

    public PizzeriaBrest(PizzaFactory fabrique) {
        this.fabrique = fabrique;
    }

    @Override
    protected Pizza créerPizza(String type) {
        return fabrique.créerPizza(type);
    }
}

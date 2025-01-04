package com.pizzeria;


import com.pizzeria.factories.PizzaFactory;
import com.pizzeria.factories.PizzeriaBrestFactory;
import com.pizzeria.pizzas.Pizza;

public class TestPizzeria {
    public static void main(String[] args) {
        PizzaFactory fabriqueBrest = new PizzeriaBrestFactory();
        Pizzeria pizzeriaBrest = new PizzeriaBrest(fabriqueBrest);

        System.out.println("Commande 1 :");
        Pizza pizza1 = pizzeriaBrest.commanderPizza("fromage");
        System.out.println("Pizza commandée : " + pizza1.getNom());

        System.out.println("\nCommande 2 :");
        Pizza pizza2 = pizzeriaBrest.commanderPizza("fruitsDeMer");
        System.out.println("Pizza commandée : " + pizza2.getNom());
    }
}

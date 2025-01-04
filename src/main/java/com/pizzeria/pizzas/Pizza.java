package com.pizzeria.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String nom;
    protected String sauce;
    protected List<String> garnitures = new ArrayList<>();

    public void préparer() {
        System.out.println("Préparation de " + nom);
    }

    public void cuire() {
        System.out.println("Cuisson à 180°C pendant 25 minutes");
    }

    public void couper() {
        System.out.println("Découpage en parts égales");
    }

    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public String getNom() {
        return nom;
    }
}

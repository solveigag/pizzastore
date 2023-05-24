package com.recipes;

import java.util.ArrayList;
import java.util.List;

public class Pepperoni implements Recipe {
 //should it
    public List<String> Toppings = new ArrayList<>();
    public Pepperoni() {
        Toppings.add("Cheese");
        Toppings.add("Pepperoni");
        Toppings.add("Tomato sauce");
    }
    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}

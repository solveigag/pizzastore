package com.recipes;

import java.util.ArrayList;
import java.util.List;

public class Plain implements Recipe{

    //should it
    public List<String> Toppings = new ArrayList<>();
    public Plain() {
        Toppings.add("Cheese");
        Toppings.add("Tomato sauce");
    }

    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}

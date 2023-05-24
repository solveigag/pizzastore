package com.food;


import java.util.List;

public class AbstractPizza implements Pizza{

   private List<String> Toppings;

    public AbstractPizza(List<String> toppings) {
        Toppings = toppings;
    }

    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}

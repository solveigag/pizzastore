package com.main;

import com.main.PizzaStore;
import com.food.Pizza;

import java.util.List;

public class Customer {

   private List<Pizza> order;

    public void Order(List<String> pizzas) throws Exception
    {
        PizzaStore store = new PizzaStore();
        order = store.Order(pizzas);
        InspectPizzaToppings();
    }

    private void InspectPizzaToppings()
    {
        for (Pizza pizza : order) {
            System.out.println(pizza.getToppings());
        }
    }

}

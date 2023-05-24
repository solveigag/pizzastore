package com.pizza;

public class PlainPizzaChef {
    public PlainPizza prepare(PlainPizzaRecipe recipe){
        PlainPizza pizza = new PlainPizza();
        pizza.Toppings = recipe.Toppings;
        return pizza;
    }
}


package com.pizza;

public class PepperoniPizzaChef {
    public PepperoniPizza prepare(PepperoniPizzaRecipe recipe){
        //here's where we build the pizza according to the recipe
        PepperoniPizza pizza = new PepperoniPizza();
        pizza.Toppings = recipe.Toppings;
        return pizza;
    }
}

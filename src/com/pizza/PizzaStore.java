package com.pizza;

public class PizzaStore {

    public PlainPizza OrderPlainPizza(){
        PlainPizzaRecipe recipe = new PlainPizzaRecipe();
        PlainPizzaChef chef = new PlainPizzaChef();

        return chef.prepare(recipe);
    }

    public PepperoniPizza OrderPepperoniPizza(){
        PepperoniPizzaRecipe recipe = new PepperoniPizzaRecipe();
        PepperoniPizzaChef chef = new PepperoniPizzaChef();

        return chef.prepare(recipe);
    }

}



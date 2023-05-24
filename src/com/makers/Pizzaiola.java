package com.makers;

import com.food.AnyPizza;
import com.food.Pizza;
import com.recipes.Recipe;

public class Pizzaiola implements Chef{
    @Override
    public Pizza Prepare(Recipe recipe) {
        return new AnyPizza(recipe.getToppings());
    }
}

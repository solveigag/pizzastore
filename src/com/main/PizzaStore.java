package com.main;

import com.food.Pizza;
import com.makers.Chef;
import com.makers.Pizzaiola;
import com.recipes.Recipe;
import com.recipes.RecipeFactory;

import java.util.ArrayList;
import java.util.List;

public class PizzaStore {

    public List<Pizza> Order(List<String> PizzaNames) throws Exception{
        List<Pizza> order = new ArrayList<>();
        RecipeFactory factory = new RecipeFactory();

        for (String PizzaName : PizzaNames) {
            Recipe recipe = factory.getRecipeFor(PizzaName);
            Chef chef = new Pizzaiola();
            order.add(Process(chef, recipe));
        }
        return order;
    }

    private Pizza Process(Chef chef, Recipe recipe) {
        return chef.Prepare(recipe);
    }


}



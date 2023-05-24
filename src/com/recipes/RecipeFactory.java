package com.recipes;

import java.util.List;

public class RecipeFactory implements Recipe{
        public Recipe getRecipeFor(String pizzaName) {
            if (pizzaName == "Plain") {
                return new Plain();
            }
            if (pizzaName == "Pepperoni") {
                return new Pepperoni();
            }
            return null;
        }

    @Override
    public List<String> getToppings() {
               return null;
        }


}

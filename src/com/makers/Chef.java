package com.makers;

import com.food.Pizza;
import com.recipes.Recipe;

public interface Chef {
    public Pizza Prepare(Recipe recipe);
}

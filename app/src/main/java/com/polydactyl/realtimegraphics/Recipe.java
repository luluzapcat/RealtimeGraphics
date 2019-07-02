package com.polydactyl.realtimegraphics;

import java.util.ArrayList;

public class Recipe {
    ArrayList<Ingredient> ingredients;


    public Recipe(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

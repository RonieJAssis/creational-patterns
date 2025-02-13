package br.com.cod3r.builder.simple.meal.director;

import br.com.cod3r.builder.simple.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.simple.meal.model.FastFoodMeal;

public class MealDirector {
    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder){
        this.builder = builder;
    }

    public void constructCombo(){
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo(){
        return builder.getMeal();
    }
}

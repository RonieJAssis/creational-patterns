package br.com.cod3r.builder.simple.meal.builder;

import br.com.cod3r.builder.simple.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    protected FastFoodMeal meal;

    public FastFoodMealBuilder(){
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal(){
        return meal;
    }

    public void buildDrink(){}
    public void buildMain(){}
    public  void buildSide(){}
    public void buildDessert(){}
    public void buildGift(){}

}

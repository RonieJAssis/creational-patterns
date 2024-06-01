package br.com.cod3r.builder.simple.meal.builder;

public class JustFriesBuilder extends FastFoodMealBuilder{

    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }

}

package br.com.cod3r.builder.fluent.meal;


import br.com.cod3r.builder.fluent.meal.model.FastFoodMeal;
import br.com.cod3r.builder.fluent.meal.model.builder.FastFoodMealBuilder;


public class Client {
	
	public static void main(String[] args) {

		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries").andMain("CheeseBurguer").forDrink("Coke").thatsAll();
		System.out.println(burguerCombo);

		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries").andMain("Monster Burguer").forDrink("Milk Shake").andDessert("Fudge Cake").andGift("2 KiloGrams").thatsAll();
		System.out.println(heartAtackCombo);

	}
}
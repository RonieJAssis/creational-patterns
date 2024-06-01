package br.com.cod3r.builder.functional.meal;


import br.com.cod3r.builder.functional.meal.model.FastFoodMeal;



public class Client {
	
	public static void main(String[] args) {

		FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries").andMain("CheeseBurguer").forDrink("Coke").thatsAll();
		System.out.println(burguerCombo);

		FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAtackCombo = new FastFoodMeal.Builder("Large Fries").andMain("Monster Burguer").forDrink("Milk Shake").andDessert("Fudge Cake").andGift("2 KiloGrams").thatsAll();
		System.out.println(heartAtackCombo);

	}
}
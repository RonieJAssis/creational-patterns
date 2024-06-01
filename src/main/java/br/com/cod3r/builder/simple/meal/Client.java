package br.com.cod3r.builder.simple.meal;

import br.com.cod3r.builder.simple.meal.builder.*;
import br.com.cod3r.builder.simple.meal.director.MealDirector;

public class Client {

	public  static void order(String name, FastFoodMealBuilder builder){
		System.out.println("Ordering a "+name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {

		order("Burger",new Menu1Builder());
		order("Veggie Burger",new Menu2Builder());
		order("Just Fries",new JustFriesBuilder());
		order("Heart Atack",new FatMealBuilder());

	}
}
package Hierarchical_Inheritance;

public class FoodDemo {

	    public static void main(String[] args) {

	        Pizza pizza = new Pizza();

	        pizza.setName("Margherita Pizza");
	        pizza.setPrice(299);
	        pizza.setSize("Large");

	        System.out.println("----- Pizza Details -----");
	        pizza.displayFoodDetails();
	        pizza.displayPizzaDetails();

	        Burger burger = new Burger();

	        burger.setName("Cheese Burger");
	        burger.setPrice(199);
	        burger.setType("Veg");

	        System.out.println("\n----- Burger Details -----");
	        burger.displayFoodDetails();
	        burger.displayBurgerDetails();
	    }
	}


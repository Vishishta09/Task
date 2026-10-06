package Hierarchical_Inheritance;

public class Food {

	    private String name;
	    private double price;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void displayFoodDetails() {
	        System.out.println("Food Name: " + name);
	        System.out.println("Price: " + price);
	    }
	}

class Pizza extends Food {

    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public void displayPizzaDetails() {
        System.out.println("Pizza Size: " + size);
    }
}

class Burger extends Food {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void displayBurgerDetails() {
        System.out.println("Burger Type: " + type);
    }
}

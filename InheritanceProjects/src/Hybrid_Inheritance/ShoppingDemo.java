package Hybrid_Inheritance;

public class ShoppingDemo {

	    public static void main(String[] args) {

	        // Create Laptop object
	        Laptops laptop = new Laptops();

	        laptop.setProductName("Laptop");
	        laptop.setPrice(65000);
	        laptop.setBrand("Dell");
	        laptop.setRam(16);

	        System.out.println("----- Laptop Details -----");
	        laptop.displayProductDetails();
	        laptop.displayElectronicsDetails();
	        laptop.displayLaptopDetails();

	        // Create Clothing object
	        Clothings clothing = new Clothings();

	        clothing.setProductName("T-Shirt");
	        clothing.setPrice(999);
	        clothing.setSize("Large");

	        System.out.println("\n----- Clothing Details -----");
	        clothing.displayProductDetails();
	        clothing.displayClothingDetails();
	    }
	}


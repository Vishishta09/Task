package Hybrid_Inheritance;

public class Product {

	    private String productName;
	    private double price;

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void displayProductDetails() {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	    }
	}

class Electronics extends Product {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayElectronicsDetails() {
        System.out.println("Brand: " + brand);
    }
}

class Clothings extends Product {

    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public void displayClothingDetails() {
        System.out.println("Size: " + size);
    }
}

class Laptops extends Electronics {

    private int ram;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void displayLaptopDetails() {
        System.out.println("RAM: " + ram + " GB");
    }
}
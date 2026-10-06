package Abstraction;

public class AbstExample {
	    public static void main(String[] args) {
	        Dog d = new Dog();

	        d.sound();
	        d.eat();
	        
	        //Shape
	        Circle c = new Circle();
	        Rectangle r = new Rectangle();

	        c.area();
	        r.area();
	        
	        //Vehicle
	        Car ca = new Car();

	        ca.start();
	        ca.stop();
	    }
	}



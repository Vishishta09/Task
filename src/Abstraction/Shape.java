package Abstraction;

	abstract class Shape {
	    abstract void area();
	}

	class Circle extends Shape {
	    void area() {
	        double r = 5;
	        double result = 3.14 * r * r;
	        System.out.println("Area of Circle: " + result);
	    }
	}

	class Rectangle extends Shape {
	    void area() {
	        int length = 10;
	        int breadth = 5;
	        int result = length * breadth;
	        System.out.println("Area of Rectangle: " + result);
	    }
	}




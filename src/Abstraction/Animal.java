package Abstraction;

	abstract class Animal {
	    abstract void sound();

	    void eat() {
	        System.out.println("Animal eats food");
	    }
	}

	class Dog extends Animal {
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}


package tnsjavaproject;

	class Employee {

	    String name = "Rahul";

	    void display() {
	        System.out.println("Employee class method");
	    }
	}

	class Developer extends Employee {

	    String name = "Arjun";

	    void displayDetails() {

	        System.out.println("Parent Name: " + super.name);

	        System.out.println("Child Name: " + this.name);

	        super.display();
	    }
	}

	public class SuperDemo {

	    public static void main(String[] args) {

	        Developer d = new Developer();

	        d.displayDetails();
	    }
	}



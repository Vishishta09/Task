package tnsjavaproject;

	class Student1 {

	    String name;
	    int age;

	    Student1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void display() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);

	        this.showMessage();
	    }

	    void showMessage() {
	        System.out.println("Student details displayed");
	    }
	}

	public class ThisDemo {

	    public static void main(String[] args) {

	        Student1 s = new Student1("Rahul", 20);

	        s.display();
	    }
	}


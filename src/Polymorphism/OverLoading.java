package Polymorphism;

public class OverLoading {
	public void display() {
		System.out.println("Hello");
	}
    public void display(String a) {
		System.out.println("Iam "+ a);
	}
    public void display(int a, int b) {
		System.out.println("Dob "+a+" "+"ID "+b);
	}
}

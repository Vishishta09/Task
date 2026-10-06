package Abstraction;

public class NestedTryExample {
	    public static void main(String[] args) {

	        try {
	            System.out.println("Outer try block");

	            try {
	                int a = 10;
	                int b = 0;

	                System.out.println(a / b);
	            }
	            catch (ArithmeticException e) {
	                System.out.println("Inner catch: Cannot divide by zero");
	            }

	        }
	        catch (Exception e) {
	            System.out.println("Outer catch: Exception occurred");
	        }
	        finally {
	            System.out.println("Finally block executed");
	        }
	    }
	}


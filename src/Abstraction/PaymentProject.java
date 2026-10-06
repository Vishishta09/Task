package Abstraction;

	interface Payment {
	    void pay(double amount);
	}

	class CreditCard implements Payment {
	    public void pay(double amount) {
	        System.out.println("Payment of ₹" + amount + " made using Credit Card");
	    }
	}

	class UPI implements Payment {
	    public void pay(double amount) {
	        System.out.println("Payment of ₹" + amount + " made using UPI");
	    }
	}

	class Cash implements Payment {
	    public void pay(double amount) {
	        System.out.println("Payment of ₹" + amount + " made using Cash");
	    }
	}

	public class PaymentProject {
	    public static void main(String[] args) {

	        Payment p1 = new CreditCard();
	        Payment p2 = new UPI();
	        Payment p3 = new Cash();

	        p1.pay(1500);
	        p2.pay(500);
	        p3.pay(300);
	    }
	}

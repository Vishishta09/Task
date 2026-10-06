package tnsjavaproject;

public class TicketBooking {

	    private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    // Default constructor
	    public TicketBooking() {
	    }

	    // Parameterized constructor
	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // Getter for stageEvent
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    // Setter for stageEvent
	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    // Getter for customer
	    public String getCustomer() {
	        return customer;
	    }

	    // Setter for customer
	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    // Getter for noOfSeats
	    public Integer getNoOfSeats() {
	        return noOfSeats;
	    }

	    // Setter for noOfSeats
	    public void setNoOfSeats(Integer noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    // Cash payment
	    public void makePayment(Double amount) {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	        System.out.printf("Amount %.1f paid in cash%n", amount);
	    }

	    // Wallet payment
	    public void makePayment(String walletNumber, Double amount) {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	        System.out.printf("Amount %.1f paid using wallet%n", amount);
	        System.out.println("number " + walletNumber);
	    }

	    // Credit card payment
	    public void makePayment(String creditCard, String ccv, String name, Double amount) {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	        System.out.println("Holder name:" + name);
	        System.out.printf("Amount %.1f paid using Master card%n", amount);
	        System.out.println("CCV:" + ccv);
	    }
	}

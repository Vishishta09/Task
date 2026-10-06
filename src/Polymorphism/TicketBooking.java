package Polymorphism;

public class TicketBooking {

    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    public TicketBooking() {
    }

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Cash payment
    public void makePayment(Double amount) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid in cash");
    }

    // Wallet payment
    public void makePayment(String walletNumber, Double amount) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid using wallet");
        System.out.println("number " + walletNumber);
    }

    // Credit card payment
    public void makePayment(String cardType, String ccv, String holderName, Double amount) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Holder name:" + holderName);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid using " + cardType + " card");
        System.out.println("CCV:" + ccv);
    }
}
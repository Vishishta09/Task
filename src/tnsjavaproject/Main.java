package tnsjavaproject;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Ticket booking details
	        String bookingDetails = sc.nextLine();

	        String[] data = bookingDetails.split(",");

	        String stageEvent = data[0];
	        String customer = data[1];
	        Integer noOfSeats = Integer.parseInt(data[2]);

	        // Create TicketBooking object
	        TicketBooking ticket = new TicketBooking(
	                stageEvent,
	                customer,
	                noOfSeats
	        );

	        // Payment mode
	        int choice = sc.nextInt();

	        switch (choice) {

	            case 1:
	                // Cash payment
	                Double cashAmount = sc.nextDouble();

	                ticket.makePayment(cashAmount);
	                break;

	            case 2:
	                // Wallet payment
	                Double walletAmount = sc.nextDouble();
	                sc.nextLine();

	                String walletNumber = sc.nextLine();

	                ticket.makePayment(walletNumber, walletAmount);
	                break;

	            case 3:
	                // Credit card payment
	                sc.nextLine();

	                String cardHolderName = sc.nextLine();
	                Double cardAmount = sc.nextDouble();

	                sc.nextLine();

	                String cardType = sc.nextLine();
	                String ccv = sc.nextLine();

	                ticket.makePayment(cardType, ccv, cardHolderName, cardAmount);
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}


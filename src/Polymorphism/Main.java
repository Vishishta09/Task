package Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] details = input.split(",");

        String stageEvent = details[0];
        String customer = details[1];
        Integer noOfSeats = Integer.parseInt(details[2]);

        TicketBooking ticket = new TicketBooking();

        ticket.setStageEvent(stageEvent);
        ticket.setCustomer(customer);
        ticket.setNoOfSeats(noOfSeats);

        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            Double cashAmount = sc.nextDouble();
            ticket.makePayment(cashAmount);
            break;

        case 2:
            Double walletAmount = sc.nextDouble();
            sc.nextLine();

            String walletNumber = sc.nextLine();

            ticket.makePayment(walletNumber, walletAmount);
            break;

        case 3:
            sc.nextLine();

            String holderName = sc.nextLine();

            Double cardAmount = sc.nextDouble();
            sc.nextLine();

            String cardType = sc.nextLine();
            String ccv = sc.nextLine();

            ticket.makePayment(cardType, ccv, holderName, cardAmount);
            break;

        default:
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}


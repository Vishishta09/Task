package tnsjavaproject;
import java.util.Scanner;

class Bank {
    String name;
    long accountNumber;
    double balance;

    void customerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    void displayDetails() {
        System.out.println("\n----- Customer Details -----");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank customer = new Bank();

        customer.customerDetails();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Customer Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    customer.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    customer.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + customer.balance);
                    break;

                case 4:
                    customer.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

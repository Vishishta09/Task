package Exception;

//Custom exception for insufficient balance
class InsufficientFundsException extends Exception {

 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for invalid amount
class InvalidAmountException extends Exception {

 public InvalidAmountException(String message) {
     super(message);
 }
}

//BankAccount class
class BankAccount {

 // Attributes
 private int accountNumber;
 private double balance;

 // Parameterized constructor
 public BankAccount(int accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Method to deposit money
 public void deposit(double amount) throws InvalidAmountException {

     if (amount <= 0) {
         throw new InvalidAmountException(
             "Deposit amount must be greater than zero."
         );
     }

     balance = balance + amount;
     System.out.println("Amount deposited: ₹" + amount);
 }

 // Method to withdraw money
 public void withdraw(double amount)
         throws InvalidAmountException, InsufficientFundsException {

     if (amount <= 0) {
         throw new InvalidAmountException(
             "Withdrawal amount must be greater than zero."
         );
     }

     if (amount > balance) {
         throw new InsufficientFundsException(
             "Insufficient funds! Available balance: ₹" + balance
         );
     }

     balance = balance - amount;
     System.out.println("Amount withdrawn: ₹" + amount);
 }

 // Method to display account balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: ₹" + balance);
 }
}

//Main class
public class BankingSystem {

 public static void main(String[] args) {

     // Creating a BankAccount object
     BankAccount account = new BankAccount(101, 5000);

     System.out.println("----- INITIAL ACCOUNT DETAILS -----");
     account.displayBalance();

     // Deposit operation
     System.out.println("\n----- DEPOSIT OPERATION -----");

     try {
         account.deposit(2000);
     }
     catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     finally {
         System.out.println("Deposit operation completed.");
     }

     // Withdrawal operation
     System.out.println("\n----- WITHDRAWAL OPERATION -----");

     try {
         account.withdraw(1500);
     }
     catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     catch (InsufficientFundsException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     finally {
         System.out.println("Withdrawal operation completed.");
     }

     // Demonstrating insufficient funds exception
     System.out.println("\n----- INSUFFICIENT FUNDS DEMO -----");

     try {
         account.withdraw(10000);
     }
     catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     catch (InsufficientFundsException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     finally {
         System.out.println("Transaction completed.");
     }

     // Demonstrating invalid amount exception
     System.out.println("\n----- INVALID AMOUNT DEMO -----");

     try {
         account.deposit(-500);
     }
     catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     finally {
         System.out.println("Invalid amount check completed.");
     }

     // Display final balance
     System.out.println("\n----- FINAL ACCOUNT DETAILS -----");
     account.displayBalance();
 }
}
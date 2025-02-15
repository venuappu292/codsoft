

import java.util.Scanner;

public class ATMInterface {
    private double balance = 100000.0;  // Starting balance for the user
    
    public void displayMenu() {
        System.out.println("Welcome to ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: $");
        double depositAmount = sc.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Successfully deposited: $" + depositAmount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: $");
        double withdrawAmount = sc.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrew: $" + withdrawAmount);
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMInterface atm = new ATMInterface();
        
        while (true) {
            atm.displayMenu();
            System.out.print("Please select an option (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.depositMoney();
                    break;
                case 3:
                    atm.withdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

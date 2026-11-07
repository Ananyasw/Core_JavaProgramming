package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        System.out.println("----- ATM MENU -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Balance: GH₵ " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Updated Balance: GH₵ " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw > 0 && withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Updated Balance: GH₵ " + balance);
                } else {
                    System.out.println("Invalid amount or insufficient balance.");
                }
                break;

            case 4:
                System.out.println("Thank you for using the ATM.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

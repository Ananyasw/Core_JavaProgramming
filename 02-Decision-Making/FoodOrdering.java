package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class FoodOrdering {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- FOOD MENU -----");
        System.out.println("1. Rice");
        System.out.println("2. Pizza");
        System.out.println("3. Burger");
        System.out.println("4. Sandwich");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("You selected Rice.");
                break;

            case 2:
                System.out.println("You selected Pizza.");
                break;

            case 3:
                System.out.println("You selected Burger.");
                break;

            case 4:
                System.out.println("You selected Sandwich.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
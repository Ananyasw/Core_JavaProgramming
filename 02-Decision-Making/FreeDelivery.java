package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class FreeDelivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        if (amount >= 100) {
            System.out.println("Congratulations! You get free delivery.");
        }

        sc.close();
    }
}

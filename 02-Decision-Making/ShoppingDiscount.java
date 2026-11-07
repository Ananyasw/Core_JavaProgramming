package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shopping amount: ");
        double amount = sc.nextDouble();

        double discount;

        if (amount < 100) {
            discount = 0;
        } else if (amount < 500) {
            discount = amount * 0.05;
        } else if (amount < 1000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.15;
        }

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (amount - discount));

        sc.close();
    }
}
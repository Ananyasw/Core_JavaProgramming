package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cost = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double selling = sc.nextDouble();

        if (selling > cost) {
            System.out.println("Profit = " + (selling - cost));
        } else {
            System.out.println("Loss or No Profit");
        }

        sc.close();
    }
}
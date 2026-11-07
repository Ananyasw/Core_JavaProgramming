package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Free Entry");
        } else if (age <= 12) {
            System.out.println("Ticket Price: GH₵ 10");
        } else if (age <= 17) {
            System.out.println("Ticket Price: GH₵ 20");
        } else if (age <= 59) {
            System.out.println("Ticket Price: GH₵ 30");
        } else {
            System.out.println("Ticket Price: GH₵ 15");
        }

        sc.close();
    }
}
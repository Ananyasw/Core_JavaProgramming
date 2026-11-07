package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class DrivingLicence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for a driving licence.");
        }
        else {
            System.out.println("Not eligible");
        }

        sc.close();
    }
}

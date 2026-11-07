package ControlStaments.DecisionMaking;

import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 50) {
            System.out.println("Result: PASS");
            System.out.println("Well done! You scored " + marks + " marks.");
        } else {
            System.out.println("Result: FAIL ");
            System.out.println("You need " + (50 - marks) + " more marks to pass.");
        }
    }

    // Mod Operator %-- x%2==0--> Even     x%2==1---->Odd
}
// Write a Program to find the number is Even/Odd-- Condition? 6/2--- Reminder is 0 and 3/2- Reminder is 1, 24/2 Remider 0
package ControlStaments.DecisionMaking;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area = " + (3.14 * radius * radius));
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter width: ");
                double width = sc.nextDouble();

                System.out.println("Area = " + (length * width));
                break;

            case 3:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();

                System.out.println("Area = " + (side * side));
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
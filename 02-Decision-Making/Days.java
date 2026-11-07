package ControlStaments.DecisionMaking;
import java.util.Scanner;

public class Days {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your day: ");
        int day = sc.nextInt();
        String dayName;
        switch (day)
         {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;  // ← This runs
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Invalid";
                System.out.println(("Invalid Entry"));
                break;
    }
System.out.println("Today is: " + dayName);  // Output: Today is: Wednesday

}
}
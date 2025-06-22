package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        // Switch

        // Take a user input and tell them the day they want to know
        // 1 to 7 -> 1 -> Mon, 5 -> Fri
        // 8 ? -> Not allowed or Error

        // int day = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number(1 to 7): ");
        int day = scanner.nextInt();

        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a valid number.");
                break;
        }
        scanner.close();
    }
}

package ex_Tasks;

import java.util.Scanner;

public class Task008_Even_Odd_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is an even number.");
        }
        else {
            System.out.println(number + " is an odd number.");
        }

    }
}

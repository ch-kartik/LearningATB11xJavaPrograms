package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else2 {

        //Allowed to Vote or not
        //If age > 18 -> allowed to vote
        //else age < 18 -> Not allowed to vote

    public static void main(String[] args) {
        // How to take the user input
        // 1. CLI Options
        //
        // int age = Integer.parseInt(args[0]);

        //2. Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 18) {
            System.out.println("You are allowed to vote.");
        }
        else {
            System.out.println("You can't vote.");
        }

        scanner.close();
    }

}

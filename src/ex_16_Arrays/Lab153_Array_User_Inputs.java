package ex_16_Arrays;

import java.util.Scanner;

public class Lab153_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array (numbers only) : ");
        if(sc.hasNextInt()) {
            int size = sc.nextInt();

            String[] numbers_marks = new String[size];

            for (int i=0; i < numbers_marks.length; i++) {
                System.out.println("Enter the number: ");
                numbers_marks[i] = sc.next();
            }

            System.out.println("------");

            for(int i=0; i < numbers_marks.length; i++) {
                System.out.println(numbers_marks[i]);
            }
        }
        else {
            System.out.println("Enter numbers only.");
            System.exit(0);
        }

        sc.close();
    }
}

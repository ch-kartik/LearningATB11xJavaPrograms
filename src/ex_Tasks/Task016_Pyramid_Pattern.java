package ex_Tasks;

import java.util.Scanner;

public class Task016_Pyramid_Pattern {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows. e.g. rows = 3");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int rows = scanner.nextInt();
            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j <= (rows - i); j++) {

                    System.out.print(" ");

                }
                for(int k = 0; k <= 2 * (i - 1); k++) {

                    System.out.print("*");

                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid Entry. Enter numbers only.");
            System.exit(0);
        }
        scanner.close();

        // Output :-

        //   *
        //` ***
        // *****
        //*******

    }
}

package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        // How the pattern we want
        // n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows. e.g. rows = 3");

        if(scanner.hasNextInt()){
            int rows = scanner.nextInt();
            for (int i = 0; i < rows; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.exit(0);
        }

        scanner.close();



        // *        // 00 01 02   j<=i
        // **       // 10 11 12   j<=i
        // ***      // 20 21 22   j<=i
    }
}

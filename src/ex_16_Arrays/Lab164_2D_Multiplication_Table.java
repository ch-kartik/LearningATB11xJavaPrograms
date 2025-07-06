package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2D_Multiplication_Table {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        if(scanner.hasNextInt()) {
            int size_of_table = scanner.nextInt();

            for(int i = 0; i < size_of_table; i++) {
                for(int j = 0; j < size_of_table; j++) {
                    System.out.print((i * j) + "\t");
                }
                System.out.println();
            }
        }
    }

}

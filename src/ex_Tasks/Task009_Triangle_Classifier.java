package ex_Tasks;

import java.util.Scanner;

public class Task009_Triangle_Classifier {

    public static void main(String[] args) {
        System.out.println("Enter the 3 sides of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if(side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        }
        else if(side1 == side2 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        }
        else {
            System.out.println("The triangle is scalene.");
        }

        scanner.close();
    }
}

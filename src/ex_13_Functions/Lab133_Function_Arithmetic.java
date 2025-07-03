package ex_13_Functions;

import java.util.Scanner;

/**
 * This class provides basic arithmetic operations.
 */

public class Lab133_Function_Arithmetic {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = 0;
        if(scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        } else {
            System.out.println("Enter integers only");
            System.exit(0);
        }

        System.out.println("Enter second number: ");
        int num2 = 0;
        if(scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        } else {
            System.out.println("Enter integers only");
            System.exit(0);
        }

        int sum = sum(num1,num2);
        int sub = substract(num1,num2);
        int div = division(num1,num2);
        int mul = multiply(num1,num2);
        int mod = modulus(num1,num2);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(mod);

    }

    /**
     * Adds two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum of num1 and num2
     */

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the difference of num1 and num2
     */

    static int substract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the quotient of num1 and num2
     * @throws ArithmeticException if num2 is zero
     */

    static int division(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not Allowed.");
        }
        return num1 / num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the product of num1 and num2
     */

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Modulus of two integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the modulus of num1 and num2
     */

    static int modulus(int num1, int num2) {
        return num1 % num2;
    }

}

package ex_06_Ternary_Operator;

public class Lab065_Ternary_Operator {
    public static void main(String[] args) {
        // Find the maximum number between two numbers
        int x = 10;
        int y = 20;

        // finding greater number using Math function
        System.out.println(Math.max(x,y));

        // finding greater number using Ternary operator
        int max = x > y ? x : y;
        System.out.println(max);
    }
}

package ex_Tasks;

public class Task002_Operator {
    public static void main(String[] args) {
        byte x = 10, y = 10, z = 10;
        double result = 0;

        /*
        //using multiplication to obtain square of a number

        result = Math.cbrt((x * x) + (y * y) - z);
        System.out.println(result);  // returns 5.748897078944831 -> cube root of 190
        */

        // using Math.pow for square of numbers
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - z);
        System.out.println(result);     //returns 5.748897078944831
    }
}

package ex_Tasks;

public class Task010_Fibonacci_Series_Generator {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        //using for loop
        /*
        for(int i = 0; i < 10; i++){
            System.out.println(num1);
            int num3 = num1 + num2;     // num3 = 0 + 1 -> 1
            num1 = num2;
            num2 = num3;
         */

        //using while loop
        int i = 0;
        while(i<10){
            System.out.println(num1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            i++;
        }
    }
}

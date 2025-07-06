package ex_16_Arrays;

public class Lab155_Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        System.out.println("-------------");

        int sum1 = 0;
        System.out.println("Using For Each Loop");  // enhanced for loop
        for(int n : numbers) {
            sum1 = sum1 + n;
        }
        System.out.println(sum1);
    }
}

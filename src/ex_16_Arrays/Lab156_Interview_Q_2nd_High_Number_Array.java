package ex_16_Arrays;

import java.util.Arrays;

public class Lab156_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find 2nd Largest number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("-------");

        System.out.println("Second Largest Number:");
        System.out.println(numbers[numbers.length-2]);

    }
}

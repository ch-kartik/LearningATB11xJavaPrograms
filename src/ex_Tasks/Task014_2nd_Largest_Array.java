package ex_Tasks;

public class Task014_2nd_Largest_Array {
    public static void main(String[] args) {
        int[] array = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = array[0];
        int sec_max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                sec_max = max;
                max = array[i];
            }
            else if (array[i] > sec_max && array[i] != max) {
                sec_max = array[i];
            }
        }
        System.out.println("First largest number is: " + max);
        System.out.println("Second largest number is: " + sec_max);
    }
}

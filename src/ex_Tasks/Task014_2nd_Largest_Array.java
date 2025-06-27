package ex_Tasks;

public class Task014_2nd_Largest_Array {
    public static void main(String[] args) {
        int[] array = {12, 34, 10, 1, 100, 3, 4, 32};
        int large = array[0];
        int second_large = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > large) {
                second_large = large;
                large = array[i];
            }
            else if (array[i] > second_large && array[i] != large) {
                second_large = array[i];
            }
        }
        System.out.println("First largest number is: " + large);
        System.out.println("Second largest number is: " + second_large);
    }
}

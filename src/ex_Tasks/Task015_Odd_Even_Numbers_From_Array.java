package ex_Tasks;

public class Task015_Odd_Even_Numbers_From_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i] + " is an Even number.");
            }
            else if (array[i] % 2 != 0) {
                System.out.println(array[i] + " is an Odd number.");
            }

        }
    }
}

package ex_07_Increment_Decrement_Operators;

public class Lab073_Increment_Decrement {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);


        // Line No. | a | exp(result)
        // 5 | 10 | NA
        // 6 | 11 | 10
        // 7 | 11 | NA
        // 8 | NA | 10
    }
}

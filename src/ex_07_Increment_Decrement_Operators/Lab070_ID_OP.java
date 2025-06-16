package ex_07_Increment_Decrement_Operators;

public class Lab070_ID_OP {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // 10 + 1 -> b -> 11
        System.out.println(b); // 11
        System.out.println(a); // 11

        // Exp and Result Table
        // Line No | a | Result b
        // 6 | 10 | NA
        // 7 | 11 | 11
        // 8 | 11(NA) | 11
        // 9 | 11 | 11(NA)

    }
}

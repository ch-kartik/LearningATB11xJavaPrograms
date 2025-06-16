package ex_07_Increment_Decrement_Operators;

public class Lab076_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a); // 23
        System.out.println(a);  // 12

        // A + B
        // A -> ++a -> ExpA = 11, a = 11
        // +
        // B -> ++a -> ExpB = 12, a = 12

        // Line No. | a | Exp
        // 5 | 10 | NA
        // 6 | NA | 11 + 12 -> 23
        // 7 | 12 | NA

    }
}

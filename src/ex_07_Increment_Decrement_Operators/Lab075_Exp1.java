package ex_07_Increment_Decrement_Operators;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);  // 22
        System.out.println(a);  // 12

        // A + B
        // A -> a++ -> ExpA = 10, a = 11
        // +
        // B -> ++a -> ExpB = 12, a = 12

        // Line No. | a | Exp (result)
        // 5 | 10 | NA
        // 6 | NA | 10 + 12 -> 22
        // 7 | 12 | NA
    }
}

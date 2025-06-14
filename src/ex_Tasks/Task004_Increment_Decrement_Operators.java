package ex_Tasks;

public class Task004_Increment_Decrement_Operators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A + B + C
        // A -> ++a -> ExpA = 11, a = 11
        // +
        // B -> a++ -> ExpB = 11, a = 12
        // +
        // C -> a++ -> ExpC = 12, a = 13

        // Line | a | expression
        // 5 | 10 | NA
        // 6 | 11 | 11
        // 6 | 12 | 23
        // 6 | 13 | 34

        //Expression = 34, a = 13
    }

}

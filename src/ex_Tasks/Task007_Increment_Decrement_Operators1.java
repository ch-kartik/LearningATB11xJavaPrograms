package ex_Tasks;

public class Task007_Increment_Decrement_Operators1 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // A + B + C
        // A -> --a -> ExpA = 19, a = 19
        // +
        // B -> a++ -> ExpB = 19, a = 20
        // +
        // C -> a-- -> ExpC = 20, a = 19

        // Line | a | expression
        // 5 | 20 | NA
        // 6 | 19 | 19
        // 6 | 20 | 39
        // 6 | 19 | 58

        //Expression = 58, a = 19
    }
}

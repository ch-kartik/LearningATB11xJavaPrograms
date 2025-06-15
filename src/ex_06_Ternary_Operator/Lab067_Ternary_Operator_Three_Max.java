package ex_06_Ternary_Operator;

public class Lab067_Ternary_Operator_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Logic Building Formula

        // Step 1 : Find inputs / Outputs
        // I/O -> n1, n2, n3 - int
        // O/P -> String -> max number

        // Step 2 : Rough Logic, Think about it
        // n1 > n2 and n1 > n3 -> n1
        // n2 > n1 and n2 > n3 -> n2
        // n3

        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(max);
    }
}

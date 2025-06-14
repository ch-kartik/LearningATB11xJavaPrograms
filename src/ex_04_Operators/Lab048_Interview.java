package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int balaji_salary = 1500;
        boolean b = !(balaji_salary > 1000 || balaji_salary < 500);
        System.out.println(b);

        // A - balaji_salary > 1000 -> 1500 > 1000 -> true
        // B - balaji_salary > 500 -> 1500 < 500 -> false
        // !(A || B) -> !(true || false) -> !true -> false

    }
}

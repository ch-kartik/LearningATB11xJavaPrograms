package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // <= Less Than or Equal To
        // > Greater Than
        // >= Greater Than or Equal To
        // == Equality (for checking)
        // != Not Equal

        // All of them will result Boolean output

        int a = 10;
        int b = 30;
        boolean c = a > b;  // 10 > 30
        System.out.println(c);

        int age_mamitha = 33;
        int age_paras = 34;
        boolean result = age_paras >= age_mamitha; //age_paras > age_mamitha or age_paras = age_mamitha
        System.out.println(result);

    }
}

package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user

        String age1 = args[0];
        int age = Integer.parseInt(age1);
        System.out.println(age1 instanceof String);

        String result = (age < 18) ? "Minor" : (age > 65) ? "Senior" : "Adult";
        System.out.println(result);

    }
}

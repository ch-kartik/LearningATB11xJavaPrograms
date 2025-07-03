package ex_13_Functions;

public class Lab131_User_Defined_Part1 {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // 1.Without Parameters and Without Return Type (Call)
        wp_wr_greet();

        // 2.Without Parameters but With Return Type (call)
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        // 3.With Parameters and Without Return Type (call)
        greet_with_details("Uma Mahesh", 32, 38000);
        greet_with_details("Manisha", 25, 27000);

        greet_with_full_name("Vijaya","Lakshmi");

        // 4. With Parameters and With Return Type (call)
        int sum1 = sum_of_two_numbers(3, 4);
        int sum2 = sum_of_two_numbers(190, 900);
        int sum3 = sum_of_three_numbers(12, 15, 20);
        int sum4 = sum_of_three_numbers(2345, 5432, 5432);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }

    // 1.Without Parameters and Without Return Type  (Declare/Define)

    static void wp_wr_greet() {
        System.out.println("Hello, How are you?");
    }

    // 2.Without Parameters but With Return Type (Declare/Define)

    static String greet_with_hello_wp_with_RT() {
        System.out.println("Hi");
        return "How are you doing?";
    }

    // 3.With Parameters and Without Return Type  (Declare/Define)

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is " + name +".\nYour are " + age + " years old.\nYour salary is Rs. " + salary + ".");
    }

    static void greet_with_full_name(String firstname, String lastname) {
        System.out.println("Hello, " + firstname + " " + lastname + " !!");
    }

    // 4. With Parameters and With Return Type (Declare/Define)
    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }

    static int sum_of_three_numbers(int a, int b, int c) {
        return a + b + c;
    }
}

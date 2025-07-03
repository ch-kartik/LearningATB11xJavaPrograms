package ex_13_Functions;

public class Lab129_Simple_Method {
    public static void main(String[] args) {
        //Call
        //int result = f1();
        f1();

        int result = return_int();
        System.out.println(result);

        boolean r = return_boolean();
        System.out.println(r);

        float pi = return_float_pi_value();
        System.out.println(pi);

        byte b = return_byte();
        System.out.println(b);

        long l = return_long();
        System.out.println(l);

        String s = return_String();
        System.out.println(s);
    }

    static void f1() {
        System.out.println("No Return");
    }

    static int return_int() {
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }

    static byte return_byte() {
        return 100;
    }

    static long return_long() {
        return 10l;
    }

    static String return_String() {
        return "Valhala";
    }

}

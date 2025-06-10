package ex_02_Java_Basics_part2;

public class Lab025_Constants {
    public static void main(String[] args) {
        final int a = 10;
        //a = 12;     // a = 12; not possible to change the value
        System.out.println(a); // Error: cannot assign a value to final variable a

        final float PI = 3.14f;
        //PI = 3.235;   // not possible to change the value
        System.out.println(PI);

    }
}

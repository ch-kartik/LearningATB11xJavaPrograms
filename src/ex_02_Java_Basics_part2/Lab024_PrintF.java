package ex_02_Java_Basics_part2;

public class Lab024_PrintF {
    public static void main(String[] args) {

        int a = 10;
        System.out.printf("The variable is %d", a);
        System.out.println();
        //%d -> int, byte, long, short - data types
        //%s -> string
        //%f -> float, double
        //%b -> boolean
        int b=20;
        System.out.println(" --- ");
        System.out.printf("%d + %d = %d", a, b, a+b);

    }
}

package ex_03_Literals;

public class Lab033_Literals_P4 {
    public static void main(String[] args) {
        int age = 65; //Decimal System -> base will be 10

        //Binary Literal
        int binary_num = 0b1010; //Decimal System - 10

        //Octal Base - 8
        int octal = 0101;

        //Hexadecimal Literals - 16
        int hex = 0xface;
        //base 16 color combination are in hex - #28a745

        System.out.println(age);
        System.out.println(binary_num);
        System.out.println(octal);
        System.out.println(hex);

    }
}

package ex_03_Literals;

public class Lab035_Non_Primitive_Literal {
    public static void main(String[] args) {
        // Primitive Data Type - Defined by Java guys
        // Max, Min, Size defined

        byte b = 10; // 1 Byte - 8 Bits
        int age = 65; // 4 Bytes - 32 Bits

        // Non-Primitive Data Type (Defined by users) , Reference Data Types
        // No Size, max, min
        // Byte - 8 , Bits - 64
        String name = "Victor"; //string is bunch of char
        int[] array_of_items = new int[10];

        System.out.println(name +" is " + age + " years old.");
        System.out.println(array_of_items);

    }
}

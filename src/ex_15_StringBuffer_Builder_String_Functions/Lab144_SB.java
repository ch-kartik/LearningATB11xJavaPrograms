package ex_15_StringBuffer_Builder_String_Functions;

public class Lab144_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Peter");
        stringBuffer.append(" Parker");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World";
        String s3 = s1 + s2; // creates a new string  "Hello World"
        System.out.println(s3); // output : Hello World
        System.out.println(s1);

    }
}

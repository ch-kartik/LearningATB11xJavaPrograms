package ex_15_StringBuffer_Builder_String_Functions;

public class Lab143_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String 90%
        String s0 = "Peter Parker";
        String s1 = new String("Peter Parker");

        // less than 10% used
        StringBuffer stringBuffer = new StringBuffer("Peter Parker");
        StringBuilder stringBuilder = new StringBuilder("Peter Parker");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }

}

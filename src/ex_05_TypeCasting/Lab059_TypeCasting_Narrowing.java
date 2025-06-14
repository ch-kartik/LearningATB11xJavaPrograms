package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val;    // // Invalid - Narrowing - Implicit Casting is not allowed.
        //System.out.println(b); //Error: possible lossy conversion from int to byte

        byte b2 = (byte) val;// Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b2); // returns 44  - In narrowing there will be loss of data

    }
}

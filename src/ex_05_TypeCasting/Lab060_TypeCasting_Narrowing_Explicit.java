package ex_05_TypeCasting;

public class Lab060_TypeCasting_Narrowing_Explicit {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no;  //Implicit Casting - Narrowing not allowed
        //System.out.println(s);  //Error:  incompatible types: possible lossy conversion from long to short

        short s = (short) phone_no;  // Explicit Casting - Narrowing
        System.out.println(s);       // returns 5866  - Data Loss

    }
}

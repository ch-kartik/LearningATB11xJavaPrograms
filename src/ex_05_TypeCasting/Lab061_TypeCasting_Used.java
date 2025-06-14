package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 600;
        float GST = 18.45f;
        //int total = course + GST;  //Narrow Implicit
        //System.out.println(total); // Error: incompatible types: possible lossy conversion from float to int

        //int total1 = course + (int) GST;  // Narrow - Explict
        //System.out.println(total1);  // returns 618 i.e. there is data missing

        float total2 = course + GST;  // Widening - auto - implicit
        System.out.println(total2);   // returns 618.45

        float total3 = (float) course + GST;  // // Widening  - Explicit
        System.out.println(total3);           // returns 618.45
    }
}

package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {
        // concatination
        System.out.println( "Jack" + " Sparrow");

        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println("a" + "b");

        String name1 = "MC";
        String name2 = " DONALDS";
        System.out.println(name1 + name2);

        char c = 'A';
        char d = 'B';
        System.out.println(c); // returns A
        System.out.println(d); // returns B
        System.out.println(c + d);  //returns 131 as ASCII value of A = 65 & B = 66  [65 + 66 =131]

        // + -> behaves differently with data types
        // + -> operator overloading
    }
}

package ex_07_Increment_Decrement_Operators;

public class Lab071_POST_ID {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a);   // 11

        // POST increment = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); // 10
        System.out.println(a_post);   // 11
    }
}

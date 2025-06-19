package ex_08_If_Condition;

public class Lab081_If_Else {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("Yes, you can go to GOA with friends.");
        }
        else {
            System.out.println("Go to school and study.");
        }
    }
}

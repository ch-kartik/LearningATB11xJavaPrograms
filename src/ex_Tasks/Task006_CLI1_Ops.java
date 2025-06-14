package ex_Tasks;

public class Task006_CLI1_Ops {
    public static void main(String[] args) {
        System.out.println("Enter two numbers.");
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("The maximum number is " + max);

    }
}

package ex_Tasks;

public class Task005_CLI_Ops {
    public static void main(String[] args) {
        System.out.println("Enter name, age and salary: ");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

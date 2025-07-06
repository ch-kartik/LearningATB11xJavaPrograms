package ex_17_OOPs;

public class Student2 {
    public static void main(String[] args) {
        System.out.println("Students are in the classroom.");

        student s1 = new student();
        s1.name = "Naveen";
        s1.roll_number = 012;
        s1.school_name = "St. Louis High School";


        s1.name("Lalitha");
        s1.study("Reetu");
        s1.marks("Ramesh", 98);
        System.out.println("\n-----------------\n");
        System.out.println(s1.name);
        System.out.println(s1.roll_number);
        System.out.println(s1.school_name);

    }
}

class student {
    String name;
    int roll_number;
    String school_name;

    String name(String name) {
        return name;
    }

    void study(String name) {
        System.out.println(name + " is studying.");
    }

    void marks(String name, int marks) {
        System.out.println(name + " is the topper of the class. He got " + marks + " out of 100.");
    }
}

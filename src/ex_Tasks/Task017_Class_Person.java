package ex_Tasks;

public class Task017_Class_Person {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "Madhuri";
        p1.job_role = "Dentist";
        p1.address = "Bay Area, San Fransisco";
        System.out.println(p1.name + " is a " + p1.job_role + " living in " + p1.address + ".");

        p1.Greet();
        System.out.println(p1.Wish());
        p1.name_and_work("Lucas", "Software Engineer", "Microsoft");
        System.out.println(p1.nationality("Raj","Indian"));

        Person p2 = new Person();
        p2.name = "Sai";
        p2.job_role = "Software Employee";
        p2.salary = 35000;
        System.out.println(p2.name + " is a " + p2.job_role + " who earns " + p2.salary + " USD annually." );

    }
}

class Person {

    // Attributes - 10

    String name;
    byte age;
    String gender;
    long phone_number;
    String email;
    String nationality;
    String company;
    String address;
    String job_role;
    int salary;

    // Behaviour - 4

    // 1.Without Parameters and Without Return Type
    void Greet() {
        System.out.println("Hello! How have you been?");
    }

    // 2.Without Parameters but With Return Type
    String Wish() {
        return "Happy Birthday!!";
    }

    // 3.With Parameters and Without Return Type
    void name_and_work(String name, String job_role, String company) {
        System.out.println(name + " works as a " + job_role + " at " + company + ".");
    }

    // 4. With Parameters and With Return Type
    String nationality(String name, String nationality) {
        return name + " is " + nationality + ".";
    }

}
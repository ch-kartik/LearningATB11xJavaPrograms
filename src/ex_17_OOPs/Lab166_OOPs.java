package ex_17_OOPs;

public class Lab166_OOPs {
    public static void main(String[] args) {

        Person amit;
        Person p2 = new Person();
        // Person -> Class
        // p2 -> Object Reference
        // new Person() -> Object Creation

        p2.name = "Rio";
        System.out.println(p2.name);

        Person p3 = new Person();
        p3.name = "Mufasa";
        System.out.println(p3.name);

        new Person().name = "No Reference Name";
    }
}

class Person {

    // Attributes | Properties | Data Members | Instance Variables

    String name;
    String phone_number;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // Behaviour | Function | Method

    String greet(String name) {
        return "Hello " + name + ". Good morning!!";
    }

    void read() {
        System.out.println("I am reading a book.");
    }

    void sleep() {
        System.out.println("Good night! I am going to bed.");
    }

    int remaining_amount_sal(int salary, int tax) {
        return salary - tax;
    }
}
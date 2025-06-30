package ex_Tasks;

public class Task018_Constructor_DC_PC {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.eat();
        p1.sleep();
        p1.walk();
        p1.doHome();
        p1.printDetails("Lalitha",28, "Hyderabad", 987654321, false);

        Person p2 = new Person();
        Person p3 = new Person("Victor", 35, "Bay Arera, San Fransisco", 234569873, true);
    }
}

class Person{

    // Attributes

    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    // Behaviour

    void eat(){
        System.out.println("Eating!!");
    }

    void sleep(){
        System.out.println("Sleeping");
    }

    void walk(){
        System.out.println("Walking");
    }

    void doHome(){
        System.out.println("I am home.");
    }

    void printDetails(String person_name, int person_age, String person_address, long person_phone, boolean person_isMale){
        this.name = person_name;
        this.age = person_age;
        this.address = person_address;
        this.phone = person_phone;
        this.isMale = person_isMale;
        System.out.println(this.name + " is a " + this.age + " year old who lives at " + this.address + ". The contact number is " + this.phone + ". Is the person a male? - " + this.isMale +".");

        //System.out.println(person_name + " is a " + person_age + " year old who lives at " + person_address + ". His contact number is " +person_phone + ". Is he a male? - " + person_isMale +".");
    }

    // Default Constructor
    Person(){
        System.out.println("This is a Default Constructor");
    }

    // Parameterized Constructor
    Person(String person_name, int person_age, String person_address, long person_phone, boolean person_isMale){
        this.name = person_name;
        this.age = person_age;
        this.address = person_address;
        this.phone = person_phone;
        this.isMale = person_isMale;
        System.out.println(this.name + " is a " + this.age + " year old who lives at " + this.address + ". The contact number is " + this.phone + ". Is the person a male? - " + this.isMale +".");
    }
}


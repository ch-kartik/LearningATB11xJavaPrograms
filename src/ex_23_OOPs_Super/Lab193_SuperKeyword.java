package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}

class Vehicle{
    public int maxSpeed = 100;

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterized Constructor");
    }

    //Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Returns, No Arguments");
    }

    void message(int a){
        System.out.println("PC - argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    Car(){
        super(); //Default Constructor
    }

    Car(int a){
        super(10); //Parent Constructor of Parent
    }

    //Method Overloading
    @Override
    void display(){
        System.out.println(this.maxSpeed);

        //Parent
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);
        super.display();
    }
}
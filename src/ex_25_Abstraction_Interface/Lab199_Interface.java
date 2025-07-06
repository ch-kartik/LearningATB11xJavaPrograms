package ex_25_Abstraction_Interface;

public class Lab199_Interface {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();
    }
}

interface Brakes{
    void applyBrakes();
}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("Concrete Comlete");
    }
}

class Car1 implements Brakes, Engine1{

    void drive(){
        startEngine();
        applyBrakes();
        stopEngine();
    }

    @Override
    public void applyBrakes(){
        System.out.println("Apply Brakes");
    }

    @Override
    public void startEngine(){
        System.out.println("Starting the engine...");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stopping engine.");
    }
}
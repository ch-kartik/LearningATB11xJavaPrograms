package ex_25_Abstraction_Interface;

public class Lab202_Abstraction {
    public static void main(String[] args) {
        ConcreteClass cc = new ConcreteClass();
        cc.display();
    }
}

interface Incomplete_Interface{
    int a = 10; // final

    void display();

    default void display2(){
        System.out.println("Default is allowed");
    }

    static void display3(){
        System.out.println("Static is allowed");
    }
}

abstract class Incomplete_abstract{
    int a = 10;

    abstract void display1();

    void display2(){}

}

class ConcreteClass implements Incomplete_Interface{

    @Override

    public void display(){
        System.out.println("Hello");
    }
}
package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50K();
        c.loan25K();
        //Father f = new Father();
        Father f1 = new Child();
        f1.loan25K();
        f1.loan50K();
    }
}

abstract class Father{

    abstract void loan50K();

    void loan25K(){
        System.out.println("Given 25K");
    }
}

class Child extends Father{

    @Override
    void loan50K(){
        System.out.println("Child will pay the loan.");
    }
}
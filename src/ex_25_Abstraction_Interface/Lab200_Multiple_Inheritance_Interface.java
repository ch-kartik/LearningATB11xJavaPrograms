package ex_25_Abstraction_Interface;

public class Lab200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.money();
    }
}

interface Mother1{
    void money();
}

interface Father1{
    void money();
}

class Son implements Mother, Father{

    @Override
    public void money(){
        System.out.println("Child Money");
    }
}

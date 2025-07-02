package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Calculator {

    int attribute;

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        Calculator c1 = new Calculator();
        int r1 = c1.add(4,4);
        double r2 = c1.add(3.14, 4.56);
        System.out.println(r1);
        System.out.println(r2);
    }
}

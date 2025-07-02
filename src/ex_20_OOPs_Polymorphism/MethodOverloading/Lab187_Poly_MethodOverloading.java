package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Lab187_Poly_MethodOverloading {

    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int r1 = m1.add(5,5);
        int r2 = m1.add(5,5,5);
        double r3 = m1.add(5.55,5.55);
        String r4 = m1.add("Hello", "World");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}

class MathOperations{
    // In the same class, when you have methods with same name
    // but with different arguments and different types

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }
}

package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args){
        P p1 = new P();
        P p2 = new P();
        P p3 = new P();

        // SIB -> 1 -> Class
        // IIB -> 3 -> Objects
        // DC -> 3 -> Objects
    }
}

class P{
    static{
        System.out.println("Static Initialization Block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    P(){
        System.out.println("Default Constructor");
    }
}
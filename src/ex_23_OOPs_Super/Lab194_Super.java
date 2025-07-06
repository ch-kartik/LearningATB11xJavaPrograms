package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.display();
    }
}

class GOD{
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends GOD{
    protected String color = "White";

    void sound(){
        System.out.println("Animal sound!");
        super.sound();
    }
}

class Dog extends Animal{
    private String color = "Black";

    Dog(){
        super();
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}
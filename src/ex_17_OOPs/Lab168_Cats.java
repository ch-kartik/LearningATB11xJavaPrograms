package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        new Cat();

        c1.mew();
        //c2.mew();
        new Cat().mew();
        System.out.println(new Cat().name);  // prints null
        c1.name = "Kitty";
        System.out.println(c1.name);

        new Cat().name = "Snowball";
        System.out.println(new Cat().name);  // Doesn't print "Snowball", it prints null
    }
}

class Cat {
    String name; //null

    void mew() {
        System.out.println("Cat is mewing");
    }
}
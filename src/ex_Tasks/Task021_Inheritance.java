package ex_Tasks;

public class Task021_Inheritance {
    public static void main(String[] args) {

        //Single Inheritance
        B x = new B();
        x.b();
        x.a();

        A y = new A();
        y.a();
        //y.b();   // class A cannot access class B method

        System.out.println("\n---------\n");

        //Multilevel Inheritance
        System.out.println("-> Son can inherit GrandFather's One BHK, Father's 2 BHK and can access his Three BHK");
        Son s = new Son();
        s.Three_BHK();
        s.Two_BHK();
        s.One_BHK();

        System.out.println("\n->Father can inherit GrandFather's One BHK and can access his Two BHK");
        Father f = new Father();
        f.Two_BHK();
        f.One_BHK();

        System.out.println("\n->GrandFather's only has access to his One BHK");
        GrandFather gf = new GrandFather();
        gf.One_BHK();

        System.out.println("\n---------\n");

        //Hierarchical Inheritance
        System.out.println("\n->Both the GrandSons can inherit from Son\n");
        Grandson1 gs1 = new Grandson1();
        gs1.GS1_Resort();
        gs1.Villa1();   //Grandson1 can access Son's Villa1
        gs1.Villa2();   //Grandson1 can access Son's Villa2
        System.out.println("\n");
        Grandson2 gs2 = new Grandson2();
        gs2.GS2_Restaurant();
        gs2.Villa1();   //Grandson2 can access Son's Villa1
        gs2.Villa2();   //Grandson2 can access Son's Villa2
    }
}

// Single Inheritance
class A{
    void a(){
        System.out.println("class A");
    }
}

class B extends A{
    void b(){
        System.out.println("class B");
    }
}

// Multiple Inheritance

class GrandFather{
    void One_BHK(){
        System.out.println("GrandFather's One BHK");
    }
}

class Father extends GrandFather{
    void Two_BHK(){
        System.out.println("Father's Two BHK");
    }
}

class Son extends Father{
    void Three_BHK(){
        System.out.println("Son's Three BHK");
    }

    void Villa1(){
        System.out.println("Son's First Villa");
    }

    void Villa2(){
        System.out.println("Son's Second Villa");
    }
}

// Hierarchical Inheritance
class Grandson1 extends Son{
    void GS1_Resort(){
        System.out.println("Grandson1 Resort");
    }
}

class Grandson2 extends Son{
    void GS2_Restaurant(){
        System.out.println("Grandson2 Restaurant");
    }
}
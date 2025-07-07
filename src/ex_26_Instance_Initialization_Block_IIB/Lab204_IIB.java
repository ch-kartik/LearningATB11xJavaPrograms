package ex_26_Instance_Initialization_Block_IIB;

public class Lab204_IIB {

    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```

    public static void main(String[] args){
        new A1();
    }
}

class A1{
    A1(){
        System.out.println("Default Constructor");
    }

    {
        System.out.println("Hi, I am an IIB");
        System.out.println("If you want to execute or call something when an object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }

    {
        System.out.println("Hi, I am IIB2");
    }

    {
        System.out.println("Hi, I am IIB3");
    }
}

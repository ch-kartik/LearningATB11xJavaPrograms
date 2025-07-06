package ex_18_OOPs_Constructor;

import java.io.FileInputStream;

public class Lab174_Example2 {
    public static void main(String[] args) {

        WebAutomation w1 = new WebAutomation();
    }
}

class WebAutomation{

    // Attributes


    // Behaviour

    // Default Constructor
    WebAutomation(){
        System.out.println("I want to read a CSV file.");
        System.out.println("Open the page before loading the scripts.");
        System.out.println("You can do anything that you want to do, when the object is created.");
//        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}

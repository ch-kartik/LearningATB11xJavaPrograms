package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        Baby b2;
    }
}

class Baby{
    // Attribute | Instance Variable | Member Variable | Data Members | Properties

    String name;

    // Behaviour | Methods | Functions

    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Sleep!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }

    // Default constructor

    Baby(){
        System.out.println("I am called Default Constructor.");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }
}
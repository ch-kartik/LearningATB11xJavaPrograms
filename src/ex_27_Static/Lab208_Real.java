package ex_27_Static;

public class Lab208_Real {
    public static void main(String[] args) {
        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);

        ATB.doAssignment();
        ATB.joinZoomCallForClass();

        ATB amit = new ATB();
        amit.setName("Amit");
        amit.setPhone("987654321");
        System.out.println(amit.getName());
        System.out.println(amit.getPhone());

        ATB lucky = new ATB();
        lucky.setName("Lucky");
        lucky.setPhone("8789545632");
        System.out.println(lucky.getName());
        System.out.println(lucky.getPhone());
    }
}

class ATB{
    static{
        System.out.println("Load the class, I will execute.");
    }

    {
        System.out.println("IIB - this is called when the object is created.");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;  // non-static
    private String phone;
    static String courseName = "ATB11X";
    static String mentorName = "Pramod";

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non-static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomCallForClass(){
        System.out.println("Class Joined.");
    }

    void howTheyAssignment(){
        System.out.println("Its different.");
    }
}
package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        // JDK 13

        int itemCode =  006;

        switch (itemCode) {
            case 001, 002, 005:
                System.out.println("All of them are electronic gadgets.");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}

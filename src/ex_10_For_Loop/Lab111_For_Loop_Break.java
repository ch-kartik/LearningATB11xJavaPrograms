package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        // break is used to come out of loop

        for(int i = 0; i < 50; i++){
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

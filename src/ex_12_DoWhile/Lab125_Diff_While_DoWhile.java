package ex_12_DoWhile;

public class Lab125_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;

        //while
//        while (a < 0){
//            System.out.println(a);
//            a++;
//        }

        //do while
        do {
            System.out.println(a);
            a++;
        } while(a < 0);
    }
}

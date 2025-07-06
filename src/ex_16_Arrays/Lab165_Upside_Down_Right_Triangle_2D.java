package ex_16_Arrays;

public class Lab165_Upside_Down_Right_Triangle_2D {
    public static void main(String[] args) {
        int n = 3;
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ***      00 01 02
        // **       10 11 12   j <= i
        // *        20 21 22   j < i
    }
}

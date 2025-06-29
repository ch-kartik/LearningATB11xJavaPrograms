package ex_12_DoWhile;

public class Lab124_DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("This will be printed once.");
            System.out.println(i);
            i++;
        } while(i < 10);
    }
}

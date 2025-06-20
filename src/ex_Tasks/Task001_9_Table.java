package ex_Tasks;

public class Task001_9_Table {
    public static void main(String[] args) {
        //byte n = 9;
        System.out.print("Multiplication of table 9:\n");
        /*
        System.out.printf("%d * 1 = %d\n",n,n*1);
        System.out.printf("%d * 2 = %d\n",n,n*2);
        System.out.printf("%d * 3 = %d\n",n,n*3);
        System.out.printf("%d * 4 = %d\n",n,n*4);
        System.out.printf("%d * 5 = %d\n",n,n*5);
        System.out.printf("%d * 6 = %d\n",n,n*6);
        System.out.printf("%d * 7 = %d\n",n,n*7);
        System.out.printf("%d * 8 = %d\n",n,n*8);
        System.out.printf("%d * 9 = %d\n",n,n*9);
        System.out.printf("%d * 10 = %d\n",n,n*10);
        */

        for (byte num = 1; num <= 10; num++) {
            System.out.println("9 * " + num + " = " + 9 * num);
        }
    }
}

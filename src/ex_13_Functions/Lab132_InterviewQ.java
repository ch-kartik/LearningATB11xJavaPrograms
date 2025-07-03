package ex_13_Functions;

public class Lab132_InterviewQ {
    public static void main(String[] args) {
        //main(3.14f);  //Error: float cannot be converted to java.lang.String[]
        float f = main(100f);
        int i = main(10f);
        int j = main(1000);
        boolean b = main(false);

        System.out.println(f);
        System.out.println(i);
        System.out.println(j);
        System.out.println(b);
    }

    public static void main(String args) {

    }

    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }
}

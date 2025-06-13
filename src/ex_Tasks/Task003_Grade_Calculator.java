package ex_Tasks;

public class Task003_Grade_Calculator {
    public static void main(String[] args) {
        String n = args[0];
        int num = Integer.parseInt(n);
        String result = (num <= 100 && num >= 90) ? "A" : (num >= 80) ? "B" : (num >= 70) ? "C" : (num >= 60) ? "D" : "F";
        System.out.println(result);
        
    }
}

package ex_Tasks;

import java.util.Scanner;

public class Task013_Palindrome_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str = "Malayalam";
        System.out.println("Enter string: ");

        String str = scanner.nextLine();
        if(str.matches("[a-zA-Z]+")) {
            String str_lowercase = str.toLowerCase();
            StringBuilder sb = new StringBuilder(str_lowercase);
            sb.reverse();
            String reverse_string = sb.toString();
            System.out.println(str);
            //System.out.println(reverse_string);
            if(str_lowercase.equals(reverse_string)) {
                System.out.println("The entered sting is a palindrome.");
            } else {
                System.out.println("The entered string is not a palindrome.");
            }
        } else {
            System.out.println("Invalid Entry. Please try again.");
            System.exit(0);
        }

   }
}

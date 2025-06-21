package ex_Tasks;

import java.util.Scanner;

public class Task012_Count_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String s = "Victoria Arcade";
        System.out.println("Enter the String: ");
        String s = scanner.nextLine();

        int vowel_count = 0;
        int consonant_count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // goes through each character of the string
            //System.out.println(ch);

            if(Character.isLetter(ch)) {    // used so the space in input string is not considered as a character ' '
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel_count += 1;
                } else {
                    consonant_count += 1;
                }
            }
        }
        System.out.println("The number of vowels are " + vowel_count);
        System.out.println("The nuber of consonants are " + consonant_count);

    }
}

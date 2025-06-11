package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a - z, !@#$%^&*()_+
        //char c2 = "A"; // it is not a char, it is a string
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';


        System.out.println(c1);
        //System.out.println(c2);   // java.lang.String cannot be converted to char
        System.out.println(c3);
        System.out.println(c5);
        System.out.println(c8);

        System.out.println("Jack" +new_line+ "Sparrow");
        System.out.println("Jack" +tab_line+ "Sparrow");
        System.out.println("Jack" + back_space+ "Sparrow");
        System.out.println("Jack is old" +carriage_return+ "Sparrow");

        System.out.println("This is First Line" +new_line+ "This is Second Line\n This is third line" );

        char c10 = 'A';
        // ASCII (limited numbers) - A -> 65

        char indian_ruppee = '₹';
        System.out.println(indian_ruppee);

        char laugh_smily = '\u1f60'; // :)
        System.out.println(laugh_smily);

    }
}

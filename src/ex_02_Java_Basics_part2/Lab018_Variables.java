package ex_02_Java_Basics_part2;

public class Lab018_Variables {
    public static void main(String[] args) {
        int _ = 65; //couldn't print this
        //System.out.println(_);     //Error: underscore not allowed here
        int $ = 65;
        System.out.println($);
        int test = 70;
        int this_is_a_long_variable_name_$_okay = 900;
        System.out.println(test + "\n" + this_is_a_long_variable_name_$_okay);
    }
}

package ex_16_Arrays;

public class Lab150_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names = {"Ragnar", "Lothbrok", "Feydis"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] name_atb11x = new String[3];
        name_atb11x[0] = "Maxwell";
        name_atb11x[1] = "McGregor";
        name_atb11x[2] = "Kim";
        System.out.println(name_atb11x.length);
        System.out.println(name_atb11x[0]);
        System.out.println(name_atb11x[2]);
        System.out.println(name_atb11x[1]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data[0]);
     }
}

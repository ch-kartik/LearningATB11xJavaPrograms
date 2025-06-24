package ex_15_StringBuffer_Builder_String_Functions;


public class Lab142_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10));    //Error: StringIndexOutOfBoundsException

        //2. Concat
        System.out.println(name.concat( " Patel"));

        //3. contains()
        System.out.println(name.contains("om"));

        //4. equals()
        System.out.println(name.equals("sonal"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6. indexOf()  // sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf('m'));

        //7. length()
        System.out.println(name.length());

        //8. replace( , )
        System.out.println(name.replace('n', 'N'));

        //9. split()
        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //10. substring( , )
        System.out.println(name.substring(1, 3));

        //11. toLowerCase()
        System.out.println(name.toLowerCase());

        //12. toUpperCase()
        System.out.println(name.toUpperCase());

        //13. startsWith()
        System.out.println(name.startsWith("S"));

        //14. endsWith()
        System.out.println(name.endsWith("a"));

        //15. trim()
        String name3 = "    Sonal Richards    ";
        System.out.println(name3.trim());

        //16. compareTo()
        System.out.println(name.compareTo("Sonal"));


        StringBuilder stringbuilder = new StringBuilder("Sonal");
        System.out.println(stringbuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);

        String s11 = "Vikram";
        String s21 =s11.concat(" Rathod");
        System.out.println(s21);

        // Concatenation by using +
        String s111 = "Hello";
        String s222 = " World";

        String s333 = " All";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "JackSparrow";
        System.out.println(n.indexOf("p"));
        System.out.println(n.indexOf("r"));
        System.out.println(n.lastIndexOf("r"));
        




    }
}

package ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Lab232_Throws {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10 / 0;
        File file = new File("");
    }

    static void t() throws Exception{
        FileInputStream fileInputStream = new FileInputStream(("C://a.log"));
    }
}

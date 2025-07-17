package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab261_Map_P1 {
    public static void main(String[] args){
        Map m1 = new HashMap();
        // Map is key and value pair
        // name -> jack
        m1.put("name","Jack");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        System.out.println(m1);
        // {phone=987654321, name=Jack, rollno=1}

        Map m2 = new LinkedHashMap();
        m2.put("name","Jack");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);
        // {name=Jack, rollno=1, phone=987654321}

        Map m3 = new TreeMap();
        m3.put("firstname","Jack");
        m3.put("secondname","Sparrow");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {firstname=Jack, phone=987654321, rollno=1, secondname=Sparrow}
    }
}

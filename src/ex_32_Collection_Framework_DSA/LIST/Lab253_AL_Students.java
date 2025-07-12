package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab253_AL_Students {
    public static void main(String[] args) {

        Student s1 = new Student("Jack", "1");
        Student s2 = new Student("DJ Tillu", "2");
        Student s3 = new Student("Puebla", "3");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(myStudents);

    }
}

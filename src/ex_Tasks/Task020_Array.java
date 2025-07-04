package ex_Tasks;

public class Task020_Array {
    public static void main(String[] args) {
        Student student[] = new Student[3];
        student[0] = new Student("Leela", 10, "Java");
        student[1] = new Student("Vamsi", 11, "Python");
        student[2] = new Student("Sidhu", 12, "C++");

        for(int i=0; i<3; i++) {
            System.out.println(student[i].toString());
        }
    }
}

class Student{
    String name;
    int roll_num;
    String course;

    // parameterised constructor
    Student(String name, int roll_num, String course){
        this.name = name;
        this.roll_num = roll_num;
        this.course = course;
    }

    public String toString(){
        return this.name + " is enrolled in " + this.course + " course and has roll number " + this.roll_num;
    }
}

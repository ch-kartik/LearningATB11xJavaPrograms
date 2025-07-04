package ex_Tasks;

public class Task019_Encapsulation {
    public static void main(String[] args) {
        ATB atb = new ATB();
        atb.Student("Leonardo", 22, "Java", true);
        System.out.println(atb.getStudent_name() + " is " + atb.getAge() + " years old and is learning " + atb.getProg_lang());
        System.out.println("Fees is paid? "+ atb.isFees_paid());
        atb.setFees_paid(false, false);

    }
}

class ATB {

    private String student_name;
    private int age;
    private String prog_lang;
    private boolean fees_paid;

    public void Student(String student_name, int age, String prog_lang, boolean fees_paid) {
        this.student_name = student_name;
        this.age = age;
        this.prog_lang = prog_lang;
        this.fees_paid = fees_paid;
    }

    // Encapsulation - Getter and Setter
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProg_lang() {
        return prog_lang;
    }

    public void setProg_lang(String prog_lang) {
        this.prog_lang = prog_lang;
    }

    public boolean isFees_paid() {
        return fees_paid;
    }

    public void setFees_paid(boolean fees_paid, boolean isAdmin) {
        if (isAdmin) {
            this.fees_paid = fees_paid;
        } else {
            System.out.println("Not authorised to change the fees payment details.");
        }
    }
}


package class_execise1a;

public class Student {
    // this is a variable
    String studentName;

    int matricNo;

    // this is a static variable
    static String institute = "Uniben";

    // this is a static method
    static void changeUniversity(){
        institute = "Convenant Univesity";
    }

    // this is a constructor
    public Student(int matricNo, String studentName){
        this.studentName = studentName;
        this.matricNo = matricNo;
    }

    // this is a normal method
    void display(){
        System.out.println("Student name: "+studentName + " \nMatric number: " + matricNo + " \nInstitution " + institute);
    }
}

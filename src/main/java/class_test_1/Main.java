package class_test_1;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ebuka", 43);
        Student student = new Student(34, "lombo");

        System.out.println("Teacher's name: " + teacher.getName());
        System.out.println("Teacher,s age: " + teacher.getAge());
        System.out.println("Student's name: " + student.getName());
        System.out.println("Student's age:" + student.getAge());

    }
}

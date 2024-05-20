package week_3.class_test_1.class_acivity_1A;

public class Main {
    public static void main(String[] args) {
        IntershipForm obj1 = new IntershipForm("John", 21,  "male");
        IntershipForm obj2 = new IntershipForm("mark", 22, "female");

        System.out.println("Name : " + obj1.name);
        System.out.println("Age : " + obj1.age);
        System.out.println("Gender : "+ obj1.gender);
    }
}

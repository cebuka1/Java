package week_3.class_test_1.class_Activity_9a;

public class Developers {
    int id;

    String Name;

    static String institute = "Decagon";

    public Developers(int id, String name){
        this.id = id;
        this.Name = name;
    }
    void display(){
        System.out.println(id + " " + Name + " " + institute);
    }
}

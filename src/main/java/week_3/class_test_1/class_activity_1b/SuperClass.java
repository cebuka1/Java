package week_3.class_test_1.class_activity_1b;

public class SuperClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperClass(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}
package week_4.demo_project;

public class ExceptionHandling {
    public static void main(String[] args) {

//        int num = 50 / 0;
//        System.out.println(num);
//        System.out.println("Run other parts of the code");
        try{
            int num = 50 / 0;
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Run other parts of the code");
    }
}

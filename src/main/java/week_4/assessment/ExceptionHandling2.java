package week_4.assessment;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 0;
        int num3;

        try{
            throw new Exception("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(num3 =num1/(num2 + 2));
        }
    }

}

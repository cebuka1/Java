package week_3.class_test_1.class_Activity_11a;

public class SplitEx {
    public static void main(String[] args) {
        String s1 = "This is a java split method example";

        System.out.println("Before spiliting : " + s1);

        String[] words = s1.split("\\s");

        for(String w : words) {
            System.out.println(w);
        }
    }
}

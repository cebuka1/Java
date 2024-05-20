package week_5.class_activity_1A;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("abuja");
        cityName.add("Enugu");
        cityName.add("warri");
        cityName.add("kaduna");
        cityName.add("sambisa");

        Iterator <String>iterator = cityName.iterator();

        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
    }
}

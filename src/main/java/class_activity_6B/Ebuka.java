package class_activity_6B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ebuka {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        String filePath = desktopPath + "/output4.csv";

        List<String> messages = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null){
                messages.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] messageArray = messages.toArray(new String[0]);
        for(String ms : messageArray){
            System.out.println(ms );
        }
    }
}

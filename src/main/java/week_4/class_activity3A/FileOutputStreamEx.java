package week_4.class_activity3A;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileOutputStream out = new FileOutputStream(desktopPath + "/out1.csv");

            String wr = "I am still learning how to write to a file";

            byte[] bytes = wr.getBytes();

            out.write(bytes);

            out.close();
            System.out.println("Successfully written to a file");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

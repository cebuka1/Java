package week_4.class_activity7A;

import java.io.File;

public class DeleteFileEx {

    public static class DeleteFilesEx{

        public static void main(String[] args) {
            String desktopPath = System.getProperty("user.home") + "/Desktop";

            File file = new File(desktopPath + "/myfile.csv");

            if(file.delete()) {
                System.out.println("file is deleted");
            }else {
                System.out.println("fail to delete file");
            }
        }
    }
}

package week_4.demo_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // step 1: Create an array of student object
        Student[] students = {
                new Student( 01, "Sunday", "Agbo", "15/11/1992", "male", 100),
                new Student( 02, "philip", "Efeonaj", "15/11/1882", "male", 101),
                new Student( 03, "Jane", "Ibeh", "15/11/1392", "female", 102),
                new Student( 04, "Sunday", "Agbo", "15/11/1980", "male", 103),
                new Student( 05, "Sunday", "Agbo", "15/11/1978", "male", 104),
        };
        //Step 2: write student objects into a csv file
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/students.csv");

            fw.write( "admissionId, FirstName, LastName, DOB, Gender, Age\n");
            for (Student student : students){
                fw.write(student.getAdmissionId() + ",");
                fw.write(student.getFirstName() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getDob() + ",");
                fw.write(student.getGender() + ",");
                fw.write(student.getAge() + "\n");
            }
            fw.close();
            System.out.println("successfully written into a CSV file");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

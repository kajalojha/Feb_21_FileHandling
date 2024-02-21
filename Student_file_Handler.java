package Feb_20_FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_file_Handler
{
  private static final String Filename = "Student.java";
  //method to serialize list of student in to a file

        public static void serializeStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Filename))) {
            oos.writeObject(students); // Write the list of students to the file
            System.out.println("Students serialized successfully.");
        }
        catch (IOException e) {
            System.err.println("Error occurred while serializing students: " + e.getMessage());
        }
    }
     //Method to deserialize list of students from a file
    public static List<Student> deserializeStudents() {
        List<Student> students = new ArrayList<>(); // Initialize an empty list for storing students
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Filename))) {
            students = (List<Student>) ois.readObject(); // Read the list of students from the file
            System.out.println("Students deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error occurred while deserializing students: " + e.getMessage());
        }
        return students; // Return the list of students
    }

}





package Feb_20_FileHandling;

import java.util.ArrayList;
import java.util.List;



public class Main
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>(); // Create a list to store students


        students.add(new Student(1, "abc", 20));
        students.add(new Student(2, "Bca", 21));
        students.add(new Student(3, "Cba", 22));

        // Serialize students to file
        Student_file_Handler.serializeStudents(students);

        // Deserialize students from file
        List<Student> deserializedStudents = Student_file_Handler.deserializeStudents();

        // Print deserialized students
        for (Student student : deserializedStudents) {
            System.out.println(student);
        }
    }
    }


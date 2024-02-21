package Feb_20_FileHandling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements Serializable
{
    private static final long serialVersion_id = 1L;
    private int id ;
    private String name ;
    private int age;
    public List<Student>students;
    public Student(int id , String name , int age)
    {
        this.id = id;
        this.name = name ;
        this.age = age ;
        this.students = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public String toString()
    {
        return ("id :" + getId() +"name : " + getName() + "age : " + getAge());
    }

    }





package isp.ManagementSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ManagementSystem {

    public static ArrayList<Student> students = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);
    public int i=0;

    public void addStudent(Student student)
    {

        students.add(student);


    }
    public void removeStudent(int id){
        int k=0;
        for(int i=0;  i< students.size(); i++)
        {
            if(students.get(i).getId() == id){
                students.remove(i);
                System.out.println("Student removed");
                k=1;
            }

        }
        if(k==0) System.out.println("The student with this id, doesn't exist");

    }

    public void updateStudent(int id, String disc, int grade)
    {

        int k=0;
        for(int i=0;  i< students.size(); i++)
        {
            if(students.get(i).getId() == id){
                students.get(i).updateGrade(disc,grade);
                k=1;
            }

        }
        if(k==0) System.out.println("The student with this id, doesn't exist");

    }
    public String calculateAverage(Student student)
    {
        float sum = 0;
        HashMap <String, Integer> grades = student.getGrades();
        for( int grade : grades.values())
            sum += grade;
        return "The average is: "+sum/grades.size();

    }

    public void viewStudent()
    {
        System.out.println("The list of the students is");
        for(Student student : students)
            System.out.println(student.toString());
    }

    public int studentsNo()
    {
        return students.size();
    }

    public static void main(String[] args)
    {
        ManagementSystem managementSystem = new ManagementSystem();
        Student student = new Student("Ariana", 121);
        student.addGrade("Istorie",90);
        student.updateGrade("Mate", 99);
        managementSystem.addStudent(student);
        managementSystem.viewStudent();

        System.out.println(managementSystem.calculateAverage(students.get(0)));
        managementSystem.removeStudent(121);
    }


}


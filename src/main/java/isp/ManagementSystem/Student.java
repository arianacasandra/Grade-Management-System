package isp.ManagementSystem;


import java.util.HashMap;


public class Student {

    private HashMap<String, Integer> grades = new HashMap<>();
    private String name;
    private int id;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        grades = new HashMap<>();
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public HashMap<String,Integer> getGrades()
    {
        return grades;
    }
    public void addGrade(String Subject, int grade)
    {
        grades.put(Subject,grade);
    }
    public void removeGrade(String Subject)
    {
        grades.remove(Subject);
    }
    public void updateGrade(String Subject, int grade)
    {
        grades.put(Subject,grade);
    }
    @Override
    public String toString()
    {
       return "Name: "+name +", id: "+id+", grades: "+ grades;
    }
    public static void main(String[] args) {

    Student student = new Student("Ariana", 121);
    student.addGrade("Matematica",80);
    student.addGrade("Istorie", 99);
    System.out.println(student.getName());
    student.addGrade("Istorie", 90);
    student.removeGrade("Matematica");
    student.removeGrade("Istorie");
    System.out.println(student.toString());







    }
}

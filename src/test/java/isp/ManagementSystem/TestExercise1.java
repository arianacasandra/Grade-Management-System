package isp.ManagementSystem;

import org.junit.Test;


import java.util.HashMap;

import static isp.ManagementSystem.ManagementSystem.students;

import static org.junit.Assert.assertEquals;

public class TestExercise1 {
    @Test
    public void TestStudentName()
    {
        Student student = new Student("Ariana", 121);
        String expected = "Ariana";
        String actual= student.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void TestStudentId()
    {
        Student student = new Student("Ariana", 121);
        int expected = 121;
        int actual = student.getId();
        assertEquals(expected, actual);
    }
    @Test
    public void TestStudentString()
    {
        Student student = new Student("Ariana", 121);
        student.addGrade("Istorie",90);
        String expected="Name: Ariana, id: 121, grades: {Istorie=90}";
        String actual = student.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void TestupdateGrade()
    {
        Student student = new Student("Ariana", 121);
        student.addGrade("Istorie",90);
        student.updateGrade("Istorie", 99);
        String expected="Name: Ariana, id: 121, grades: {Istorie=99}";
        String actual = student.toString();
        assertEquals(expected,actual);

    }

    @Test
    public void TestremoveGrade()
    {
        Student student = new Student("Ariana", 121);
        student.addGrade("Matematica",80);
        student.addGrade("Istorie", 90);
        student.removeGrade("Matematica");
        student.removeGrade("Istorie");
        String expected = "Name: Ariana, id: 121, grades: {}";
        String actual = student.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void TestManagementAverage()
    {
        ManagementSystem managementSystem = new ManagementSystem();
        Student student = new Student("Ariana", 121);
        student.addGrade("Istorie",90);
        student.addGrade("Math",100);
        String expected = "The average is: 95.0" ;
        assertEquals(expected,managementSystem.calculateAverage(student));

    }

    @Test
    public void TestAddStudent()
    {
        ManagementSystem managementSystem = new ManagementSystem();
        assertEquals(0, managementSystem.studentsNo());
        Student student = new Student("Ariana", 121);
        student.addGrade("Istorie",90);
        student.addGrade("Math",100);
        managementSystem.addStudent(student);
        assertEquals(1, managementSystem.studentsNo());

    }


    @Test
    public void TestUpdate()
    {
        ManagementSystem managementSystem = new ManagementSystem();

        Student student = new Student("Ariana", 121);
        student.addGrade("Istorie",90);
        student.addGrade("Math",100);
        managementSystem.addStudent(student);
        managementSystem.updateStudent(121,"Math", 50);
        assertEquals("The average is: 70.0",managementSystem.calculateAverage(students.get(0)));


    }

}

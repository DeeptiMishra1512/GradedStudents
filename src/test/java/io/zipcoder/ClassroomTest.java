package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassroomTest {

    @Test
    public void getStudentsByScoreTest() {
        List<Double> examScores = new ArrayList<>();

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);

        String firstName1 = "Deepti";
        String lastName1 = "Mishra";
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student1 = new Student(firstName1, lastName1, examScores);

        Classroom room = new Classroom();
        room.addStudent(student);
        room.addStudent(student1);

     List<Student> actual = room.getStudentsByScore();
        Assert.assertEquals(actual,room.getStudents());




    }

    @Test
    public void getGradeBookTest() {
        List<Double> examScores = new ArrayList<>();

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        examScores = new ArrayList<>();
        examScores.add(91.0);
        examScores.add(95.0);
        examScores.add(75.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);

        String firstName1 = "Deepti";
        String lastName1 = "Mishra";
        examScores = new ArrayList<>();
        examScores.add(80.0);
        examScores.add(95.0);
        examScores.add(60.0);
        examScores.add(96.0);
        Student student1 = new Student(firstName1, lastName1, examScores);


        String firstName2 = "D";
        String lastName2 = "M";
        examScores = new ArrayList<>();
        examScores.add(50.0);
        examScores.add(45.0);
        examScores.add(20.0);
        examScores.add(36.0);
        Student student2 = new Student(firstName2, lastName2, examScores);

        Classroom room = new Classroom();
        room.addStudent(student);
        room.addStudent(student1);
        room.addStudent(student2);

        Map<Student, String> actual = room.getGradeBook();
        Map<Student,String> expected = new HashMap<>();
        expected.put(student , "A");
        expected.put(student1 , "C");
        expected.put(student2 , "F");

        Assert.assertEquals(actual,expected);




    }
}

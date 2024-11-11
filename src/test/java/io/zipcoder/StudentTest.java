package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentTest {
    List<Double> examScores = new ArrayList<>();


    @Test
    public void addExamScoreTest() {
    // Given
        String firstName = "Leon";
        String lastName = "Hunter";

        Student student = new Student(firstName, lastName, examScores);
        List<Double> expected = new ArrayList<>();
    // When
        student.addExamScore(100.0);
        String output = student.getExamScores().toString();

        Assert.assertEquals(expected.get(0), student.getExamScores().get(0));

    // Then
        System.out.println(output);

    }


   @Test
   public void getExamScoreTest(){
       // : Given
       String firstName = "Leon";
       String lastName = "Hunter";
       examScores.add(100.0);
       examScores.add(95.0);
       examScores.add(123.0);
       examScores.add(96.0);
       Student student = new Student(firstName, lastName, examScores);
       List<Double> expected = new ArrayList<>();
       expected.add(100.0);
       expected.add(95.0);
       expected.add(123.0);
       expected.add(96.0);

// When
       String output = student.getExamScores().toString();
       Assert.assertEquals(expected.get(0), student.getExamScores().get(0));
       Assert.assertEquals(expected.get(1), student.getExamScores().get(1));
       Assert.assertEquals(expected.get(2), student.getExamScores().get(2));
       Assert.assertEquals(expected.get(3), student.getExamScores().get(3));

// Then
       System.out.println(output);
   }


   @Test

      public void setExamScoreTest(){

       // : Given
       String firstName = "Leon";
       String lastName = "Hunter";
       examScores.add(100.0);
       Student student = new Student(firstName, lastName, examScores);
       List<Double> expected = new ArrayList<>();
       expected.add(150.0);
// When
       student.setExamScore(0, 150.0);
       String output = student.getExamScores().toString();

       Assert.assertEquals(expected.get(0), student.getExamScores().get(0));
// Then
       System.out.println(output);


   }


   @Test
   public void getAverageExamScoreTest(){
       // : Given
       String firstName = "Leon";
       String lastName = "Hunter";
       examScores.add(100.0);
       examScores.add(150.0);
       examScores.add(250.0);
       examScores.add(0.0);

       Student student = new Student(firstName, lastName, examScores);

       // When
       Double output = student.getAverageExamScore();

       // Then
       System.out.println(output);

   }


   @Test
    public void toStringTest(){
       // : Given
       String firstName = "Leon";
       String lastName = "Hunter";
       examScores.add(100.0);
       examScores.add(150.0);
       examScores.add(250.0);
       examScores.add(0.0);
       //Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
       Student student = new Student(firstName, lastName, examScores);

       // When
       String output = student.toString();

       // Then
       System.out.println(output);

   }

}





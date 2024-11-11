package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    List<Double> examScores = new ArrayList<>();


    @Test
    public void addExamScoreTest() {
    // Given
        String firstName = "Leon";
        String lastName = "Hunter";

        Student student = new Student(firstName, lastName, examScores);

    // When
        student.addExamScore(100.0);
        String output = student.getExamScores().toString();

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

// When
       String output = student.getExamScores().toString();

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

// When
       student.setExamScore(1, 150.0);
       String output = student.getExamScores().toString();

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





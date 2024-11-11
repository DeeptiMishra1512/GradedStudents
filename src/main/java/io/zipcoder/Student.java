package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName = "";
    String lastName = "";
    List<Double> examScores = new ArrayList<>();
    //String grade ="";

    public Student(String firstName, String lastName, List<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = testScores;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
       return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public List<Double> getExamScores(){

        return examScores;
    }


    public void addExamScore(double examScore){

        examScores.add(examScore);


    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber,newScore);
        //System.out.println("examScores.size()" + examScores.size());

    }




    public String getNumberOfExamsTaken(){
        String result = "";
        for(int i=0;i<examScores.size();i++){
          result = "Exam" + i + "->" + examScores.get(i);
        }

        return result;
    }


    //Method to print all exams taken
    public Double getAverageExamScore(){
        Double sum = 0.0;
        Double avg = 0.0;
        for(int i =0; i<examScores.size();i++){
           sum = sum + examScores.get(i);
        }

        avg = sum/examScores.size();
        return  avg;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }
}



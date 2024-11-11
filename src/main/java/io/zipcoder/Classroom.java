package io.zipcoder;

import java.util.*;

// https://www.youtube.com/watch?v=ZA2oNhtNk3w
// to understand comparator and comparable In arraylist  

public class Classroom {

    ArrayList<Student> students = new ArrayList<>();
    int maxNumOfStudents = 0;
    //Student class object
    List<Double> testScore = new ArrayList<>();

    //Nullary Constructor to  initializes the composite students
    // object to be an empty array of 30 Student objects.
    public Classroom() {
        this.students = new ArrayList<>(30);

    }

    //Constructor with max number of students that classroom can hold as an argument
    public Classroom(int maxNumberOfStudents) {
        this.maxNumOfStudents = maxNumberOfStudents;
    }

    //Constructor with collection of objects as an argument.
    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }

    //Getter to return the composite students object.
    public ArrayList<Student> getStudents() {
        return students;
    }

    //returns the sum of all exam averages divided by the number of students.
    public Double getAverageExamScore() {
        Double avgExamScores;
        Double sum = 0.0;
        Double eachScoreAvg = 0.0;
        Double totalSum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            List<Double> score1 = (students.get(i).getExamScores());
            for (int j = 0; j < score1.size(); j++) {
                sum = sum + score1.get(j);
            }
            eachScoreAvg = sum / score1.size();
            totalSum = totalSum + eachScoreAvg;
        }

        avgExamScores = totalSum / students.size();
        return avgExamScores;

    }


    public void addStudent(Student student) {
        students.add(student);
    }


    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)) {
                students.remove(i);
            }
        }
    }

    public List<Student> getStudentsByScore() {

        //Use comparator to sort class(Student) data type.
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAverageExamScore() > o2.getAverageExamScore()) {
                    return 1;
                } else {
                    return (o1.getFirstName().compareTo(o2.firstName));
                }
            }

        };

        //After defining sorting method(Ascending/descending
        //Sort the class students of type Student.
        Collections.sort(students, comp);

        return students;
    }



    public Map<Student, String> getGradeBook(){
        Map<Student,String> grader = new HashMap<>();

        int count = 0;
        int percentile = 0;

        for (int i = 0; i < students.size(); i++) {
            count = 0;
            for (int j = 0; j < students.size(); j++) {
                if (students.get(i).getAverageExamScore() > students.get(j).getAverageExamScore()) {
                    count++;
                }
            }
            percentile = (count * 100) / (students.size() - 1);
            if(percentile >= 90){
                grader.put(students.get(i),"A");
            }
            else if(percentile <90 && percentile >=51){
                grader.put(students.get(i),"D");
            }
            else if(percentile < 51 && percentile >=30){
                grader.put(students.get(i),"C");
            }
            else if(percentile < 30 && percentile >=11){
                grader.put(students.get(i),"B");
            }
            else if(percentile <11){
                grader.put(students.get(i),"F");
            }


        }

        return grader;

    }


    //Steps for Map
    /*
    // Creating an empty HashMap
    Map<String, Integer> hm
            = new HashMap<String, Integer>();

    // Inserting pairs in above Map
    // using put() method
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

    // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
            hm.entrySet()) {

        // Printing keys
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());

*/


}









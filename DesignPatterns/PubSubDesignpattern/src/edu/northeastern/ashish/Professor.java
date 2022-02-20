package edu.northeastern.ashish;

import java.util.ArrayList;

public class Professor extends  Person{

    ArrayList<Student> students;
    String quiz;


    public Professor(String name, int id, int age) {
        super(name, id, age);
        this.students = new ArrayList<>();
    }

    public void giveQuiz(String quiz){
        this.quiz = quiz;
        for (Student student: students) {
            student.takeQuiz(this);
        }
    }
}

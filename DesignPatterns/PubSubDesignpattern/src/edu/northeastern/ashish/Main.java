package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Student 1", 1, 24);
        Student st2 = new Student("Student 2", 2, 24);
        Student st3 = new Student("Student 3", 3, 24);
        Student st4 = new Student("Student 4", 4, 24);
        Student st5 = new Student("Student 5", 5, 24);

        Professor Ashish = new Professor("Ashish", 007, 21);
        Professor brad = new Professor("Brad Pitt", 8, 25);

        st1.subscribe(Ashish);
        st3.subscribe(Ashish);
        st4.subscribe(Ashish);

        st2.subscribe(brad);
        st5.subscribe(brad);


        Ashish.giveQuiz("Quiz1");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        brad.giveQuiz("Brads Quiz 1");

        st4.unSubscribe(Ashish);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Ashish.giveQuiz("Quiz 2");




    }
}

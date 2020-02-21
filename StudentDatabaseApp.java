package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Want to create an array of objects so we don't have to create new student objects every time manually
        // Ask the user how many new students will be added to the data base
        System.out.print("How many students would you like to enroll? ");
        Scanner input = new Scanner(System.in); // Want to create an array students based on the size entered
        int numOfStudents = input.nextInt();
        // Creating an array of objects
        Student[] students = new Student[numOfStudents]; // Now want to iterate through each element

        // Create i number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString()); // needs to be printed because we're returning a string
        }
    }
}

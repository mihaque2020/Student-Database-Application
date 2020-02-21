package studentdatabaseapp;

import java.util.Scanner;

// Each student comes from this class
public class Student {
    // Encapsulation
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private double tuitionBalance = 0;
    private static double courseCost = 600;
    private static int ID = 1000;


     // Constructor: Prompt user to enter name and year for each student
    public Student() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.print("1) Freshman\n2) Sophomore\n3) Junior\n4) Senior\nEnter student class standing: ");
        this.gradeYear = input.nextInt();

        setStudentID();
    }
    // Generate ID:  with 5 digit unique ID with first # being grade level
    private void setStudentID() {    // Want to work with a static figure bc it means
        ID++;// Increments one every time a new student object is created
        this.studentID = gradeYear + "" + ID; // Grade Level + ID; concatenation will make the arguments into a string bc it has priority
    }

    // Enroll in Courses: following option of courses: his,math,eng,compsci,chem -101
    public void enroll() {
        // Get Inside a loop, and user hits 0 when done enrolling

        do {
            System.out.print("Enter course to enroll [Q to quit]: ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")) {
                this.courses = courses + "\n" + course; // Every time a course is added, it gets added to the list on the next line
                this.tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
              }
        } while (1 != 0);
    }
    // View Balance
    public void viewBalance(){
        System.out.println("Current Balance: $" + tuitionBalance);
    }
    // Pay Tuition
    public void payTuition() {
        viewBalance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        double payment = input.nextDouble();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance(); // Automatically show current balance after payment
    }
    // Show status/info
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nCurrent Balance: $" + tuitionBalance;

    }
}

package kaliyona.controller;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Classes and Objects
 * This is an example class to illustrate packages and imports in Java
 */
import student.example.Student;

public class StudentController {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Rahul";
        s1.printName();
    }
}

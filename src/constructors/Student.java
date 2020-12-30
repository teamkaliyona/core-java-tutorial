package constructors;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Classes and Objects
 * This is an example class to illustrate Constructors in Java
 */

public class Student {

    int id;
    String name;
    int totalMarks;

    void printName() {
        System.out.println("Student name is " + name);
    }

    Student(){ //constructor
        this.id = 101;
        this.name = "Ankita";
        System.out.println("Student object created with id " + this.id);
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(String name, int totalMarks){
        this.name = name;
        this.totalMarks = totalMarks;
    }

    Student(int id, String name, int totalMarks){
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public static void main(String[] args) {
       // Student s1 = new Student(); //default
       // s1.name = "Rahul";
       // s1.printName();

        Student s2 = new Student(); //no args
        s2.printName();

        Student s3 = new Student(102, "Babita"); //param
        s3.printName();

        Student s4 = new Student(103, "Rohan", 98);
    }

}

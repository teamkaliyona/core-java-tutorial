package classExample;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Classes and Objects
 * This is an example class to illustrate Creation of Objects in Java
 */

public class Student {

    int id;
    String name;
    int totalMarks;

    void printName(){
        System.out.println("Student name is " + name);
    }

    void printTotalMarks(){
        System.out.println("Total Marks is " + totalMarks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Rahul";
        s1.totalMarks = 99;

        s1.printName();
        s1.printTotalMarks();

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Ankita";
        s2.totalMarks = 98;
        s2.printName();
        s2.printTotalMarks();
    }

}

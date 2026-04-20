package student;

public class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

package exam;

import student.Student;

public class Result extends Student {
    private int marks1, marks2, marks3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public void displayResult() {
        displayStudent();

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Result r = new Result(101, "Rahul", 75, 82, 68);
        System.out.println("----- Mark Sheet -----");
        r.displayResult();
    }
}

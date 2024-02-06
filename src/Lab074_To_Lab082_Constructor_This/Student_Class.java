package CoreJava.src.Lab074_To_Lab082_Constructor_This;

public class Student_Class {

    String studentName;
    double gpa;
    String year;
    boolean hasScholorship;

    public void printInfo(){
        System.out.println("Student Name : " + this.studentName);
        System.out.println("Student GPA : " +this.gpa);
        System.out.println("Student Enrollment Year : " +this.year);
        System.out.println("Scholarship  : " +this.hasScholorship);

        System.out.println("*******************************");


    }
    Student_Class(String studentName, double gpa, String year, boolean hasScholorship){
        this.studentName = studentName;
        this.gpa = gpa;
        this.year = year;
        this.hasScholorship = hasScholorship;
    }

}


package CoreJava.src.Lab073_To_Lab083_OOPS_Part2.Parameterized_Constructor;

public class Student_Class {

    String studentName;
    double gpa;
    boolean hasScholorship;
    String year;

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


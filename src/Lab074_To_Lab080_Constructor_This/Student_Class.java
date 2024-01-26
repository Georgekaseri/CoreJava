package CoreJava.src.Lab074_To_Lab080_Constructor_This;

public class Student_Class {

    String studentName;
    double gpa;
    String year;
    boolean hasScholorship;

    public void printInfo(){
        System.out.println(this.studentName);
        System.out.println(this.gpa);
        System.out.println(this.year);
        System.out.println(this.hasScholorship);


    }
    Student_Class(String studentName, double gpa, String year, boolean hasScholorship){
        this.studentName = studentName;
        this.gpa = gpa;
        this.year = year;
        this.hasScholorship = hasScholorship;
    }

}


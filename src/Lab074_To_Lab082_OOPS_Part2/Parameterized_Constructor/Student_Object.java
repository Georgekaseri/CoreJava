package CoreJava.src.Lab074_To_Lab082_OOPS_Part2.Parameterized_Constructor;

public class Student_Object {
    public static void main(String[] args) {

        Student_Class s1 =  new Student_Class("Hasan Ali", 30, "December 2021", true);
        Student_Class s2 =  new Student_Class("Mohammed", 58, "June 2023", false);
        Student_Class s3 =  new Student_Class("Faiyaz Ali", 36, "Sep 2000", true);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();




    }
}

package CoreJava.src.Lab52_To_Lab60_StringBuffer;

public class Lab053_Appends {
    public static void main(String[] args) {

        /*

Append() Appends the specified character(s) or object to the end of the string
         */

        StringBuilder NewStringBuilder = new StringBuilder("I am from");
        System.out.println(NewStringBuilder.append(" United Kingdom"));

        StringBuilder CourseName = new StringBuilder("I am learning");
        CourseName.append(" Java");
        System.out.println(CourseName.toString());
    }
}

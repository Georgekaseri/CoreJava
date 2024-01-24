package CoreJava.src.Lab52_To_Lab64_StringBuilder;

public class Lab054_Delete {
    public static void main(String[] args) {

        /*

Append() Appends the specified character(s) or object to the end of the string
         */

        StringBuilder str = new StringBuilder("I am from United Kingdom");

        str.delete(10,16);
        System.out.println(str);




    }
}

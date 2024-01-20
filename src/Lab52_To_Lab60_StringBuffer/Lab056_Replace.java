package CoreJava.src.Lab52_To_Lab60_StringBuffer;

public class Lab056_Replace {
    public static void main(String[] args) {

        /*

Replaces the characters in the string between the specified start and end indices
with the specified string.
         */

        StringBuilder str = new StringBuilder("My name is George Sydney");
        str.replace(18,24, " Kaseri");
        System.out.println(str);





    }
}

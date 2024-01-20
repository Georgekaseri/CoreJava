package CoreJava.src.Lab040_To_Lab051_String_Class_Functions;

public class Lab040_charAt {
    public static void main(String[] args) {
        /*
        charAt(int index): Returns the character at the specified index in the string.
Example: "hello".charAt(0) returns 'h'.
         */

        String str = new String("Hyderabad");
        System.out.println(str.charAt(5)); // out come 'a'

        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(str1.charAt(8)); // Out Come "I"

    }
}

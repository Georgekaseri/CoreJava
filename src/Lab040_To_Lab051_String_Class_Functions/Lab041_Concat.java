package CoreJava.src.Lab040_To_Lab051_String_Class_Functions;

public class Lab041_Concat {
    public static void main(String[] args) {
        /*
        concat(String str): Concatenates the specified string to the end of the original string.
Example: "hello".concat(" world") returns "hello world".
         */

        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str1); // Output: Hello
        System.out.println(str2); // Output: Hello World

    }
}

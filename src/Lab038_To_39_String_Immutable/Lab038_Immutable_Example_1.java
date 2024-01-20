package CoreJava.src.Lab038_To_39_String_Immutable;

public class Lab038_Immutable_Example_1 {
    public static void main(String[] args) {
       /* The reason for making strings immutable in Java is to increase efficiency, security, and
        thread-safety.

        */
               // Here is an example that demonstrates the immutability of strings in Java:



        String str1 = "Hello"; // String Constant Pool
        String newname = new String("New Name"); //Heap Area
        String str2 = str1.concat(" World");
        System.out.println(str1); // Output: Hello
        System.out.println(str2); // Output: Hello World

        /*
        In this example, we create a string str1 with the value "Hello". We then concatenate the
string " World" to str1 using the concat() method, and assign the result to str2. The concat()
method does not modify str1 but creates a new string with the value "Hello World".
The original string str1 remains unchanged, and the new string str2 is assigned the
concatenated value. This demonstrates the immutability of strings in Java.
         */
    }
}

package CoreJava.src.Lab040_To_Lab045_String_Class_Functions;

public class Lab044_equalsIgnoreCase {
    public static void main(String[] args) {
       /*

equalsIgnoreCase(String str): Returns true if the string is equal to the specified string,
ignoring case differences, otherwise false.

        */
                    // Example:
        String txt =new String("HYDERABAD");
        System.out.println(txt.equalsIgnoreCase("hyderabad")); // Out Come True


        String expected_email_address = "HYDERABAD@123";
        String actual_email_address = "hyderabad@123";
        if (expected_email_address.equalsIgnoreCase(actual_email_address)) {
            System.out.println("Welcome");
        }else {
            System.out.println("Please Check your Password");
        }
             }
}

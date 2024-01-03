package CoreJava.src.Lab010_To_Lab011_StringAndMethods;

public class Lab010_Strings {
    public static void main(String[] args) {


        String firstName = "Hasal Ali ";
        String lastName = "MOhammed";
        String FullName = firstName + lastName;
        System.out.println(FullName);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7


    }
}

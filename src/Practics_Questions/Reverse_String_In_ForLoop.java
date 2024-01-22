package CoreJava.src.Practics_Questions;

public class Reverse_String_In_ForLoop {
    public static void main(String[] args) {
        String str = "Freedom of Live";

        String rev = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
            
        }
        System.out.println("This is Reverse String : " + rev);
    }
}

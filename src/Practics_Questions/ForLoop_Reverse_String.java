package CoreJava.src.Practics_Questions;

public class ForLoop_Reverse_String {
    public static void main(String[] args) {

        String name = "GeorgeK";

        String x = "";

        for (int i = name.length()-1; i >= 0; i--) {
            x = x + name.charAt(i);
            
        }
        System.out.println("This is Reverse String" + " :- " + x);
    }
}

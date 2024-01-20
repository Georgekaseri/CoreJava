package CoreJava.src.Practics_Questions;

public class TwoStrings {
    public static void main(String[] args) {

        String str1 = "India";
        String str2 = new String("India");
        System.out.println(str1 == str2);  // false

        System.out.println(str1.equals(str2)); // true
    }
}

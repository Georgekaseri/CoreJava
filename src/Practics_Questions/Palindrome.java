package CoreJava.src.Practics_Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = newScanner.next();

        boolean results = isPalindrome(user_input);
        if (results){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String userInput) {
        String origianl_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_String = sb.reverse().toString();
        return origianl_str.equalsIgnoreCase(reverse_String);
    }
}

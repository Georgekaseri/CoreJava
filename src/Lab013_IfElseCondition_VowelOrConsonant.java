package CoreJava.src;

import java.util.Scanner;

public class Lab013_IfElseCondition_VowelOrConsonant {
    public static void main(String[] args) {
        /*
         Check whether an alphabet is vowel or consonant using if..else statement.


1. Input from user
Score (Data Type) - Char

2.Write basic rough code
if (ch == 'a'  || ch == 'e' || ch == 'i'  || ch == 'o'  || ch == 'u')
then print "This is a Vowel"
else "This is a Consonant

 if (Condition) {
            System.out.println("Write statement here");
        }
        else if (condition) {
        System.out.println("Write statement here");
        }
        else if(condition){
         System.out.println("Write statement here");
        }
        else{
            System.out.println("Write statement here");
        }

         */
        // 3. Write the real code
      Scanner cha = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char alphabet = cha.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e'|| alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ) {
            System.out.println("This is Vowel");

        }
        else if (alphabet == 'y' || alphabet == 'w' ) {
            System.out.println("This is Semi Vowel");

        }
        else {
            System.out.println("This is Consonant");

        }




    }
}

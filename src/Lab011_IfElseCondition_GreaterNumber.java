package CoreJava.src;

import java.util.Scanner;

public class Lab011_IfElseCondition_GreaterNumber {
    public static void main(String[] args) {
        /*
        Take two int values from user and print greatest among them.


1. Input from user
Score (Data Type) - int - char

2. Basic login or Brute force Login write basic rough code
if number1 >= number2 then print number1 is greater than number2
else if number2 >= number1 then print number2 is greater than number1

 if (Condition) {
            System.out.println("Write statement here");
        }
        else if (condition) {
        System.out.println("Write statement here");
        }
        else{
            System.out.println("Write statement here");
        }

         */
        // 3. Write the real code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("The greatest number is: " + number1);

        } else if (number2 > number1) {
            System.out.println("The Greatest number is " + number2);

        }else{
            System.out.println("Both numbers are equal.");
        }




    }
}

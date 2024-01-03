package CoreJava.src;

import java.util.Scanner;

public class Lab012_IfElseCondition_EvenOrOdd {
    public static void main(String[] args) {
        /*


    Write a program for checking enter number is even or odd.
    ---------------------------------------------------------
1. Input from user
Score (Data Type) - int -



if (Condition) {
            System.out.println("Write statement here");
        }

        else{
            System.out.println("Write statement here");
        }

2. Write basic rough code
if number is %==0 then print Even Number
else print Odd number
         */
        // 3. Write the real code
        Scanner Number =new Scanner(System.in);
        System.out.println("Enter Number here");
        int num1 = Number.nextInt();

        if (num1% 2 == 0) {
            System.out.println("This is Event");

        }else {
            System.out.println("This is Odd");
        }



    }
}

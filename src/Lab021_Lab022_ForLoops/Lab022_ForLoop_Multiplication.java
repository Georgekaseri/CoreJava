package CoreJava.src.Lab021_Lab022_ForLoops;

import java.util.Scanner;

public class Lab022_ForLoop_Multiplication {
    public static void main(String[] args) {
        /*

A : - Initialization  --- JVM What variable, where you are start
B : - Condition --- When you want this to stop. --- True, False
B : - Increment / Decrement
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to do Multiplication");
        int num = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(num  +  " x "  +  i  + " = "  + (num*i) );

        }
        System.out.println(" ********** End Of Pragram ********** ");

  
        }

    }


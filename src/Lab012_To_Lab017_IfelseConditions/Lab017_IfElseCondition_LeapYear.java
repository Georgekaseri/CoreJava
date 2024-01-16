package CoreJava.src.Lab012_To_Lab017_IfelseConditions;

import java.util.Scanner;

public class Lab017_IfElseCondition_LeapYear {
    public static void main(String[] args) {
       // Write a Program to Check Leap Year
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year here");
        int years = sc.nextInt();


        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0)  {
            System.out.println("Leap Year");
            
        }else {
            System.out.println("Not Leap Year");
        }



sc.close();

    }
}

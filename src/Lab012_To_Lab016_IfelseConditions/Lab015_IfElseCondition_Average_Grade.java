package CoreJava.src.Lab012_To_Lab016_IfelseConditions;

import java.util.Scanner;

public class Lab015_IfElseCondition_Average_Grade {
    public static void main(String[] args) {
        /*
        This program calculates the grade of a student based on the marks entered
        by user in each subject. Program prints the grade based on this logic.

If the average of marks is >= 80 then prints Grade ‘A’
If the average is <80 and >=60 then prints Grade ‘B’
If the average is <60 and >=40 then prints Grade ‘C’
else prints Grade ‘D’


1. Input from user
Score (Data Type) - int - char

2. Basic login or Brute force Login write basic rough code
if score is >= 80 && <= 100 print A
else if score >=60 && <79 Print B
else if score >= 40 && <59 Print C
else Print Grade D

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
        System.out.println("Enter student score");
        int score = sc.nextInt();

        if(score >=80 && score<=100){
            System.out.println("Your Grade is A+");

        } else if (score>=60 && score<=79) {
            System.out.println("Your Grade is B");

        } else if (score >=40 && score <=59) {
            System.out.println("Your Grade is C");
        }
        else if(score >=101 && score <= 10000) {
            System.out.println("Enter right student's score");
        }


    }
}

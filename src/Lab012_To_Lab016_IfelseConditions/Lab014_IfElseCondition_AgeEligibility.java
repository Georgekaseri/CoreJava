package CoreJava.src.Lab012_To_Lab016_IfelseConditions;

import java.util.Scanner;

public class Lab014_IfElseCondition_AgeEligibility {
    public static void main(String[] args) {
        /*
        Write a program to take input age of person and check he is eligible for marriage or not.


1. Input from user
Score (Data Type) - int

2.Write basic rough code
if age is >=21 <=100 can marriage and print "You are  eligible for marriage"
else if age <=16 can not marriage and print "You are teenage "
else if >= 101 && <=200  print you are too old for marriage

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
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age ");
int Age = scanner.nextInt();

        if (Age >=21 && Age <=100 ) {
            System.out.println("You are Eligible for Marriage");

        }else if (Age <=16){
            System.out.println("You are teenager");
                    }
        else if (Age >=17 && Age <=20) {
            System.out.println("You are not allow marriage");

        }
        else if (Age >=101 && Age <=200){
            System.out.println("You are too old ");

        }
        else System.out.println("Please enter valid age");


    }
}

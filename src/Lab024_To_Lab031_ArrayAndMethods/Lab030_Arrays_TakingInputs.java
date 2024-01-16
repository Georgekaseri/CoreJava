package CoreJava.src.Lab024_To_Lab031_ArrayAndMethods;

import java.util.Scanner;

public class Lab030_Arrays_TakingInputs {
    public static void main(String[] args) {
      
      
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];


        System.out.println("Enter Your English Subject Marks");
        marks[0] = sc.nextFloat();

        System.out.println("Enter Your Math Subject Marks");
        marks[1] = sc.nextFloat();

        System.out.println("Enter Your Science Subject Marks");
        marks[2] = sc.nextFloat();

        System.out.println("Enter Your Social Subject Marks");
        marks[3] = sc.nextFloat();

        System.out.println("Enter Your Accounting Subject Marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if (marks [i] > 60 && marks [i] <70){
                System.out.println("You have good  in this Subject " + marks[i]);
            } else if (marks [i] >71 && marks [i] <90) {
                System.out.println("Your Subject mark is merit" +  marks[i]);
                
            } else if (marks [i] >=91 && marks [i] <= 100 ) {
                System.out.println("Your topper in this Subject" +  marks[i]);

            } else if (marks [i] <30) {
                System.out.println("You are fail in this Subject " +  marks[i]);

            }
            else
            {
                System.out.println("Please enter marks between 1 to 100");
            }


        }
sc.close();

    }


}





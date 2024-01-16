package CoreJava.src.Lab018_Lab019_Scanner;
import java.util.Scanner;

public class Lab018_Scanner_Grade {
    public static void main(String[] args) {
        System.out.println("Taking Input From the Student");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English Marks");
        double a = sc.nextDouble();

        System.out.println("Enter Hindi Marks");
        double b = sc.nextDouble();

        System.out.println("Enter Social Marks");
        double c = sc.nextDouble();

        System.out.println("Enter Science Marks");
        double d = sc.nextDouble();

        System.out.println("Enter Accounting Marks");
        double e = sc.nextDouble();

        double sum = a + b + c + d + e;
        System.out.println("Total marks is: " + sum);

        double ave = sum /6;
        System.out.println("Average  is " + ave);

        double per = sum/500*100;
        System.out.println("Percentage : " + per);


        }

    }


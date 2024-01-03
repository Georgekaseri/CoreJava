package CoreJava.src.Lab019_To_Lab020_SwitchCase;

import java.util.Scanner;

public class Lab020_SwitchCase_Sales {
    public static void main(String[] args) {
        /*
      Write a java program for yearly Sales

Switch (Veriable Name){
    case 1:
    System.out.println("Message");
    break;

    default:
    System.out.println("Message");


1. Input from user
        String

2. Write basic rough code
    1 -- Januray  2 -- Feb 3 --March 4 --April 5 -- May 6 --Saturdays 7 -- Sunday

    */

        // 3. Write the real code
        Scanner NewScanner = new Scanner(System.in);
        System.out.println("Enter Month ");
        String monthName = NewScanner.next();

        switch (monthName){
            case "January":
                System.out.println(monthName + "150000 sales");
                break;

            case "Febraury":
                System.out.println(monthName + "40000 sales");
                break;

            case "March":
                System.out.println(monthName  +" "+ "100000 sales");
                break;

            case "April":
                System.out.println(monthName  + "58000 sales");
                break;

            case "May":
                System.out.println(monthName  + " " + "150000 sales");
                break;

            case "June":
                System.out.println(monthName  + "40000 sales");
                break;

            case "July":
                System.out.println(monthName  + "100000 sales");
                break;

            case "August":
                System.out.println(monthName  + "58000 sales");
                break;

            case "September":
                System.out.println(monthName  +  "150000 sales");
                break;

            case "October":
                System.out.println(monthName   +  "40000 sales");
                break;

            case "November":
                System.out.println(monthName  + "100000 sales");
                break;

            case "December":
                System.out.println(monthName  + "58000 sales");
            default:


        }

        System.out.println("Enter correct  month name");



    }
}

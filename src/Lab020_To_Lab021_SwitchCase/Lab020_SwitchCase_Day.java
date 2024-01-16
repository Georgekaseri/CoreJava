package CoreJava.src.Lab020_To_Lab021_SwitchCase;

import java.util.Scanner;

public class Lab020_SwitchCase_Day {
    public static void main(String[] args) {
        /*
      Write a java program to demonstrate switch case for days of week

Switch (Veriable Name){
    case 1:
    System.out.println("Message");
    break;

    default:
    System.out.println("Message");


1. Input from user
        int

2. Write basic rough code
    1 -- Monday 2 -- Tuesday 3 --Wednesday 4 --Thursday 5 -- Friday 6 --Saturdays 7 -- Sunday

    */

        // 3. Write the real code
        Scanner day = new Scanner(System.in);

        System.out.println("Enter Number between 1 to 7 I will which day it is");
        int DayNumber = day.nextInt();

        switch (DayNumber){
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("This is Saturday");
                break;
            case 7:
                System.out.println("This is Sunday");
            default:
                System.out.println("Invalid...Please Enter the 1 to 7...");
        }
        System.out.println("   ***    End of Program    ***  ");
    }
}

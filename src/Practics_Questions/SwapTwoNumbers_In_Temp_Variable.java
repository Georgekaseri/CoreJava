package CoreJava.src.Practics_Questions;

import java.util.Scanner;

public class SwapTwoNumbers_In_Temp_Variable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of X");
        int x = sc.nextInt();

        System.out.println("Enter Value of Y");
        int y = sc.nextInt();

      x = x + y;
      y = x - y;
      x = x - y;

        System.out.println("Value of X " + " " + x );
        System.out.println("Value of Y " + " " + y);

        System.out.println("****************** EOP ******************");
    }



}

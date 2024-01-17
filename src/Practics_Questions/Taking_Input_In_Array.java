package CoreJava.src.Practics_Questions;

import java.util.Scanner;

public class Taking_Input_In_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Size of Array");
        int n = sc.nextInt();
        int [] int_array = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int_array[i] = sc.nextInt();

        }
        System.out.println(" ---------- Output ----------");

        for (int i = 0; i <n ; i++) {
            System.out.println("List of Elements" + " " + int_array[i]);



        }

        System.out.println("---------- EOP ---------- ");
        sc.close();
    }
}

package CoreJava.src.Lab022_Lab023_ForLoops;

public class Lab022_ForLoop_FizzBuzz {
    public static void main(String[] args) {
        /*

A : - Initialization  --- JVM What variable, where you are start
B : - Condition --- When you want this to stop. --- True, False
B : - Increment / Decrement
    */


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }

        System.out.println("***************** EOP *****************");
    }
}





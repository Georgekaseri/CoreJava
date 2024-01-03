package CoreJava.src.Lab021_Lab022_ForLoops;

public class Lab021_ForLoop_Event {
    public static void main(String[] args) {
        /*

A : - Initialization  --- JVM What variable, where you are start
B : - Condition --- When you want this to stop. --- True, False
B : - Increment / Decrement
    */


//        for (int i = 10; i >= 1; i--) {
//
//
//            System.out.println(i );
//
//        }
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <=10 ; i++)
//        {
//
        /*int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println("Sum: " + sum);*/
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


    }
}




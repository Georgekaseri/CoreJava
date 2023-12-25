package CoreJava.src;

public class Lab008_IncrementOperator {
    public static void main(String[] args) {


        /*
        Increment Operators
        Pre and Post
         */

        //Pre

        int preIncrement = 70;

        System.out.println("variable = " + preIncrement);
        System.out.println("preIncrement = " + preIncrement);
        System.out.println("++preIncrement = " + ++preIncrement);



        //Post
        int b = 20;
        System.out.println(++b);
        System.out.println(b);

        int c = 20;
        System.out.println(++c + c++);
        System.out.println(c);

        int variable = 100;
        System.out.println("Original value of the variable = " + variable);

        // using post-increment operator
        int postIncrement = variable++; // postIncrement = 100, variable = 101

        System.out.println("postIncrement = " + postIncrement);
        System.out.println("variable = " + variable + "\n");

        // postIncrement = 101
        System.out.println("postIncrement++ = " + postIncrement++);
        // postIncrement = 102
        System.out.println("postIncrement++ = " + postIncrement++);
        // postIncrement = 103
        System.out.println("postIncrement++ = " + postIncrement++);

        System.out.println("\npostIncrement = " + postIncrement);





    }
}

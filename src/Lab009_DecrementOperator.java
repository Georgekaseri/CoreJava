package CoreJava.src;
//

public class Lab009_DecrementOperator {
    public static void main(String[] args) {
        /*
        Decrement Operators
        Pre and Post
         */

        //Pre --x;
        int variable = 11;
        System.out.println("Original value of the variable = " + variable);

        // using preDecrement operator
        int preDecrement = --variable;

        // variable = 10
        System.out.println("variable = " + variable);
        // preDecrement = 10
        System.out.println("preDecrement = " + preDecrement);
        // preDecrement = 9
        System.out.println("--preDecrement = " + --preDecrement);


        //Post x--;
        int variable1 = 75;
        System.out.println("Original value of the variable = " + variable1);

        // using postDecrement operator
        // postDecrement = 75, variable = 74
        int postDecrement = variable1--;
        System.out.println("postDecrement = " + postDecrement);
        System.out.println("variable1 = " + variable1 + "\n");
        // postDecrement = 74
        System.out.println("postDecrement-- = " + postDecrement--);
        // postDecrement = 73
        System.out.println("postDecrement-- = " + postDecrement--);
        // postDecrement = 72
        System.out.println("postDecrement-- = " + postDecrement--);

        System.out.println("\npostDecrement = " + postDecrement);

        int c = 25;
        System.out.println(--c - c--);
        System.out.println(c);
    }
}

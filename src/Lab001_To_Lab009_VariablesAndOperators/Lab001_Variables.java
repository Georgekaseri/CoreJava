package CoreJava.src.Lab001_To_Lab009_VariablesAndOperators;

public class Lab001_Variables {
    public static void main(String[] args) {
        /*

                               List of Variables
                                ------------------
        byte            from    -128         to      127
        short           from    -32768       to      32767
        int             from    -2147483648  to      2147483647
        long            from    -2           to      2147483647
        float           from    1.4E-45      to      3.40E38
        double          from    4.9E-324     to      1.79E308
        char            from    0            to      65535

Here is a list of all primitives in Java:
----------------------------------------

byte (number, 1 byte)
short (number, 2 bytes)
int (number, 4 bytes)
long (number, 8 bytes)
float (float number, 4 bytes)
double (float number, 8 bytes)
char (a character, 2 bytes)
boolean (true or false, 1 byte)

         */

        //  To declare and assign a number use the following syntax:

        int myNumber = 5;
        System.out.println(myNumber);

        //  To define a double floating point number, use the following syntax:

        double d = 3.5;
        d = 3.0;
        System.out.println("Value of D is " + d);

        //  If you want to use float, you will have to cast:

        float f = (float) 4.5;

        // Or, You can use this:
        float f1 = 4.5f; // (f is a shorter way of casting float)
        System.out.println("Value of F is " + f);

        /*Characters and Strings
         In Java, a character is it's own type and it's not simply a number,
         so it's not common to put an ascii value in it, there is a special syntax for chars:
         */

        char c = 'g';
        System.out.println(c);

        /*
        String is not a primitive. It's a real type, but Java has special treatment for String.

        Here are some ways to use a string:  */

        //Create a string with a constructor
        String s1 = new String("Who let the dogs out?");        // String object stored in heap memory

        // Just using "" creates a string, so no need to write it the previous way.
        String s2 = "Who who who who!";

        // String literal stored in String pool Java defined the operator + on strings to concatenate:
        String s3 = s1 + " " + s2;
        System.out.println(s3);


        //You can also concat string to primitives:

        int num = 5;
        String s = "I have " + num + " cookies"; //Be sure not to use "" with primitives.

         /*boolean
        Every comparison operator in java will return the type boolean. Unlike other languages,
        it only accepts two special values: true or false. */

        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }



    }
}

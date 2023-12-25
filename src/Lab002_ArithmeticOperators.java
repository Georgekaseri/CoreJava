package CoreJava.src;

public class Lab002_ArithmeticOperators {
    public static void main(String[] args) {
/*
                            Arithmetic operators
                            -------------------
Operator	Name	        Description	                            Example
    +	    Addition	    Adds together two values	             x + y
    -	    Subtraction	    Subtracts one value from another	     x - y
    *	    Multiplication	Multiplies two values	                 x * y
    /	    Division	    Divides one value by another	         x / y
    %	    Modulus	        Returns the division remainder	         x % y
    ++	    Increment	    Increases the value of a variable by 1	 ++x
    --	    Decrement	    Decreases the value of a variable by 1	 --x
 */

        //a few numbers
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        System.out.println("Variable values...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    x = " + x);
        System.out.println("    y = " + y);

        //adding numbers
        System.out.println("Adding...");
        System.out.println("    i + j = " + (i + j));
        System.out.println("    x + y = " + (x + y));

        //subtracting numbers
        System.out.println("Subtracting...");
        System.out.println("    i - j = " + (i - j));
        System.out.println("    x - y = " + (x - y));

        //multiplying numbers
        System.out.println("Multiplying...");
        System.out.println("    i * j = " + (i * j));
        System.out.println("    x * y = " + (x * y));

        //dividing numbers
        System.out.println("Dividing...");
        System.out.println("    i / j = " + (i / j));
        System.out.println("    x / y = " + (x / y));

        //computing the remainder resulting from dividing numbers
        System.out.println("Computing the remainder...");
        System.out.println("    i % j = " + (i % j));
        System.out.println("    x % y = " + (x % y));

        //mixing types
        System.out.println("Mixing types...");
        System.out.println("    j + y = " + (j + y));
        System.out.println("    i * x = " + (i * x));

        //1. Addition(+): This operator is a binary operator and is used to add two operands.

        int k = 10;
        int n = k++%5;
        System.out.println(n);






    }
}

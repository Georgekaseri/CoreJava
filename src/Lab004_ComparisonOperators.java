package CoreJava.src;

public class Lab004_ComparisonOperators {
    public static void main(String[] args) {
        /*
                                Comparison Operators
                              --------------------
Operator	    Name        	            Example
    ==	        Equal to        	        x == y
    !=	        Not equal	                x != y
    >	        Greater than	            x > y
    <	        Less than	                x < y
    >=	        Greater than or equal to	x >= y
    <=	        Less than or equal to	    x <= y
         */


int a1 = 10;
int b1 = 20;
int c1 = 30;

boolean z = c1 > a1 && c1 > b1;
        System.out.println(z);


        // create variables
        int a = 7, b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true
    }

}

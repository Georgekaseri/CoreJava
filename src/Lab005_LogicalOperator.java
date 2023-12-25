package CoreJava.src;

public class Lab005_LogicalOperator {
    public static void main(String[] args) {
        /*
                            Logical Operator
                            -----------------

Operator	    Name	            Description	                                             Example
    && 	        Logical and	        Returns true if both statements are true	            x < 5 &&  x < 10
    || 	        Logical or	        Returns true if one of the statements is true	        x < 5 || x < 4
    !	        Logical not	        Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
         */

        // && operator

        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        byte a = 25;
        byte b = 20;

        boolean z = a >= b && b <= a;
        System.out.println("A is greater than B " + z);
    }
}

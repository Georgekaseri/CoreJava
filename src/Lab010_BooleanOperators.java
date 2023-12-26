package CoreJava.src;

public class Lab010_BooleanOperators {
    public static void main(String[] args) {

        /*
                                Boolean Operators
                                -----------------
   There aren't that many operators to use in conditional statements
   and most of them are pretty straight forward:
         */

        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // true
        result = a > b; // false
        result = a <= 4; // a smaller or equal to 4 - true
        result = b >= 6; // b bigger or equal to 6 - false
        result = a == b; // a equal to b - false
        result = a != b; // a is not equal to b - true
        result = a > b || a < b; // Logical or - true
        result = 3 < a && a < 6; // Logical and - true
        result = !result; // Logical not - false
    }
}

package CoreJava.src.Lab001_To_Lab009_VariablesAndOperators;

public class Lab003_AssignmentOperators {
    public static void main(String[] args) {
        /*
                                    Assignment Operators
                                  ---------------------
Operator	    Example	        Same As
    =	        x = 5	        x = 5
    +=	        x += 3	        x = x + 3
    -=	        x -= 3	        x = x - 3
    *=	        x *= 3	        x = x * 3
    /=	        x /= 3	        x = x / 3
    %=	        x %= 3	        x = x % 3
    &=	        x &= 3	        x = x & 3
    |=	        x |= 3	        x = x | 3
    ^=	        x ^= 3	        x = x ^ 3
    >>=	        x >>= 3	        x = x >> 3
    <<=	        x <<= 3	        x = x << 3
         */
        // create variables


        int a = 4;
        int var;

        // assign value using =
        var = a;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var);


        float x = 10 % 2;
        System.out.println("x value is " + x);

        int a1 = 25000;
        int b = 35000;

        b *= 3;
        a1 += b;
        System.out.println(a1);
    }
}

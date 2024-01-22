package CoreJava.src.Lab52_To_Lab64_StringBuilder;

public class Lab061_setCharAt {
    public static void main(String[] args) {

        /*

   setCharAt() Sets the character at the specified index in the string to the specified character.
         */

        StringBuilder str = new StringBuilder("Leeds, west Yorkshire, United Kingdom");
        System.out.println("String " + str.toString());

        str.setCharAt(7, 'W');
        System.out.println("After setCharAt() String = " + str.toString());






    }
}

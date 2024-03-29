package CoreJava.src.Lab52_To_Lab64_StringBuilder;

public class Lab064_TrimToSize {
    public static void main(String[] args) {

        /*

    Trims the capacity of the string builder to its current length.


         */

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("GeeksForGeeks");

        // add more string to StringBuilder
        str.append("Contribute");

        // print capacity
        System.out.println("Capacity before " + "applying trimToSize() = " + str.capacity());

        // applying trimToSize() Method
        str.trimToSize();

        // print string
        System.out.println("String = " + str.toString());

        // print capacity
        System.out.println("Capacity after" + " applying trimToSize() = " + str.capacity());






    }
}

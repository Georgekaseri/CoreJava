package CoreJava.src.Lab52_To_Lab64_StringBuilder;

public class Lab063_EnsureCapacity {
    public static void main(String[] args) {

        /*

  Ensures that the capacity of the string builder is at least the specified minimum capacity.


         */

        // create a StringBuilder object
        StringBuilder str = new StringBuilder();

        // print string capacity
        System.out.println("Before ensureCapacity " + "method capacity = " + str.capacity());


        // apply ensureCapacity()
        str.ensureCapacity(18);

        // print string capacity
        System.out.println("After ensureCapacity" + " method capacity = " + str.capacity());






    }
}

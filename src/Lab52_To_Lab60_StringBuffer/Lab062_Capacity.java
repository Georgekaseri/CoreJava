package CoreJava.src.Lab52_To_Lab60_StringBuffer;

public class Lab062_Capacity {
    public static void main(String[] args) {

        /*

   Capacity returns the current capacity of the string builder.


         */

        StringBuilder st = new StringBuilder("String Builder Capacity");
        System.out.println("Capacity = " + st.capacity());

        st = new StringBuilder("A");
        System.out.println("Capacity = " + st.capacity());





    }
}

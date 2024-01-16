package CoreJava.src.Lab024_To_Lab031_ArrayAndMethods;

public class Lab027_Array_Elements_Using_ForLoop {
    public static void main(String[] args) {

        /*
        Each element in the array is accessed via its index. The index begins
         with 0 and ends at (total array size)-1. All the elements of array
         can be accessed using Java for Loop.
         */

        // Declaring array literal

        int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };

        // accessing the elements of the specified array
        for (int i = 0; i < intArray.length; i++)
            System.out.println("Element at index " + i + " : "+ intArray[i]);
    }
}

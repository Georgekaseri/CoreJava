package CoreJava.src.Lab023_To_Lab028_ArrayAndMethods;

public class Lab027_ArrayOfIntegers {
    public static void main(String[] args) {
        /*
        Java program to illustrate creating an array of integers,
        puts some values in the array, and prints each value to standard output.
         */

        // declares an Array of integers.
        int[] arrayName;

        // allocating memory for 5 integers.
        arrayName = new int[10];

        // initialize the first elements of the array
        arrayName[0] = 95;

        // initialize the second elements of the array
        arrayName[1] = 150;

        // so on
        arrayName[2] = 250;
        arrayName[3] = 150;
        arrayName[4] = 50;
        arrayName[5] = 150;
        arrayName[6] = 370;
        arrayName[7] = 200;
        arrayName[8] = 75;
        arrayName[9] = 175;

        // accessing the elements of the specified array
        for (int i = 0; i <arrayName.length ; i++) {
            System.out.println("Element at index " +  i  + " : " + arrayName[i]);

        }

    }
}

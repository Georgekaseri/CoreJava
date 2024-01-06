package CoreJava.src.Lab023_To_Lab028_ArrayAndMethods;

public class Lab028_ArrayOfString {
    public static void main(String[] args) {
        /*
        Java program to illustrate creating an array of Strings,
        puts some values in the array, and prints each value to standard output.
         */

        String[] IndianStateName;
        IndianStateName = new String[10];

        IndianStateName[0] = "Andhra Pradesh";
        IndianStateName[1] = "Arunachal Pradesh";
        IndianStateName[2] = "Assam";
        IndianStateName[3] = "Bihar";
        IndianStateName[4] = "Chhattisgarh";
        IndianStateName[5] = "Goa";
        IndianStateName[6] = "Gujarat";
        IndianStateName[7] = "Haryana";
        IndianStateName[8] = "Himachal Pradesh";
        IndianStateName[9] = "Jharkhand";

        for (int i = 0; i <IndianStateName.length ; i++) {
            System.out.println("Element at index " + i + " : " + IndianStateName[i]);

        }






    }
}

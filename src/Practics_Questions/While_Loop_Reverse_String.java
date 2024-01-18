package CoreJava.src.Practics_Questions;

public class While_Loop_Reverse_String {
    public static void main(String[] args) {

        String name = "Hyderabad";

        //Converting String into Char
        char[] charArray = name.toCharArray();

        // Print Char Length
        System.out.println(charArray.length);

        // Put Left and Right in Variables
        int left = 0;
        int right = charArray.length-1;

        // Run the While Loop
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;

        }
        String rev_name = new String(charArray);
        System.out.println("This is Reverse String" + " :- " + rev_name);







    }
}

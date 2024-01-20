package CoreJava.src.Lab52_To_Lab60_StringBuffer;

public class Lab052_Inserts {
    public static void main(String[] args) {

        /*

    Inserts the specified character(s) or object at the specified index in the string.
         */

        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.insert(4, "123");
        System.out.println(sb);

        StringBuilder CityName = new StringBuilder("Leed");
        CityName.insert(4,"s");
        System.out.println(CityName);

        StringBuilder StateName = new StringBuilder("West York");
        StateName.insert(9,"shire");
        System.out.println(StateName);
    }
}

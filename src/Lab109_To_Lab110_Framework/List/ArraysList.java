package CoreJava.src.Lab109_To_Lab110_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
       List mylist = new ArrayList();
       mylist.add("Hyderabad");
       mylist.add(868642);
       mylist.add(true);

       for (Object k :mylist) {
           System.out.println(k);
       }
    }
}

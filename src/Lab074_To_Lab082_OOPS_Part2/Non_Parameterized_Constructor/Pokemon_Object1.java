package CoreJava.src.Lab074_To_Lab082_OOPS_Part2.Non_Parameterized_Constructor;

public class Pokemon_Object1 {
    public static void main(String[] args) {

        Pokemon_class1 p1 = new Pokemon_class1("Hasan",25);
        System.out.println(p1.Level);
        p1.attack();

        int a = 100;
        String a1 = String.valueOf(a);
        System.out.println(a1);

        Integer b = 100;
        System.out.println(Integer.max(500,200));
    }
}

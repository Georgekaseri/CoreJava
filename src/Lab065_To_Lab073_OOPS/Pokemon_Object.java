package CoreJava.src.Lab065_To_Lab073_OOPS;

public class Pokemon_Object {
    public static void main(String[] args) {

        Pokemon_class p1 = new Pokemon_class();
        p1.pName = "pikachu";
        p1.Level = 10;

        Pokemon_class p2 = new Pokemon_class();
        p2.pName = "chachu";
        p2.Level = 20;

       p2.attack();
    }
}

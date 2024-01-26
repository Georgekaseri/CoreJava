package CoreJava.src.Lab076_To_Lab078_Constructor;

public class Pokemon_class1 {
    String pName;
    int Level;

    Pokemon_class1(String kname, int kLevel){
        pName = kname;
        Level = kLevel;

    }

    void attack(){
        System.out.println(pName + " attack");
    }

}

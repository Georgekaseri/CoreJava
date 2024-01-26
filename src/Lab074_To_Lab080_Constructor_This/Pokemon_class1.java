package CoreJava.src.Lab074_To_Lab080_Constructor_This;

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

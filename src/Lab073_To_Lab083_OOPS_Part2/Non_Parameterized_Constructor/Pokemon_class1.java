package CoreJava.src.Lab073_To_Lab083_OOPS_Part2.Non_Parameterized_Constructor;

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

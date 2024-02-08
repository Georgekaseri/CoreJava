package CoreJava.src.Lab073_To_Lab083_OOPS_Part2.Parameterized_Constructor;

public class Pen_Class {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

    Pen_Class(String color, String type){
        this.color = color;
        this.type = type;
    }

    public static void main(String[] args) {
        Pen_Class pen1 = new Pen_Class("Blue", "ballpoint");


        Pen_Class pen2 = new Pen_Class("Black", "gel");


        pen1.printInfo();
        pen2.printInfo();

    }
}





package CoreJava.src.Lab074_To_Lab080_Constructor_This;

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
}





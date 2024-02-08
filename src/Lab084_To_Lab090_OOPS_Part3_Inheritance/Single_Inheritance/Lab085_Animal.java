package CoreJava.src.Lab084_To_Lab090_OOPS_Part3_Inheritance.Single_Inheritance;

public class Lab085_Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Lab085_Animal {
    void bark() {
        System.out.println("Dog is barking");
    }


    public static void main(String[] args) {
Dog myDog = new Dog();
myDog.eat();
myDog.bark();
    }
}
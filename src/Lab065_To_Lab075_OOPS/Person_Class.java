package CoreJava.src.Lab065_To_Lab075_OOPS;

public class Person_Class {

    /*
    Every class in Java can be composed of the following elements:
● fields, member variables or instance variables - These are variables that hold data specific to a
particular object. For each object of a class, there is one field.

● member methods or instance methods - These perform operations on objects and are defined within
the class.

● static or class fields - These fields are common to any object within the same class. They can only
exist once in the class irrespective of the total number of objects in the class.

● static or class methods - These methods do not affect a specific object in the class.

● inner classes - At times a class will be defined within a class if it is a subset of another class. The class
contained within another is the inner class.


     */
    // Attribute
    String name;
    long phoneNumber;
    double height;
    int age;
    String edu_back;
    String address;
    String gender;
    String emailId;


    // Behaviour - What you can do,

    void sleep(){
        System.out.println("Want to sleep");

    }
    void talk(){
        System.out.println("We can talk");
    }
    void work(){
        System.out.println("We have to work");
    }
    boolean isMarried(){
        return true;
    }
}

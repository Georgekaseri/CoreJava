package CoreJava.src.Lab074_To_Lab082_Constructor_This;

import java.util.Scanner;

public class Person {
    String name;

    public void PrintName(){
        System.out.println("Your name is " + this.name);
    }
    Person(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name here");
        String name = sc.next();

        Person p1 = new Person(name);
        p1.PrintName();

        System.out.println("Enter Your Last Name here");
        String name2 = sc.next();
        Person p2 = new Person(name2);
        p2.PrintName();


        sc.close();
    }
}

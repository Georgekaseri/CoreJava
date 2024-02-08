package CoreJava.src.Lab065_To_Lab072_OOPS_Part1.ClassAndObjects;

public class Person_Object {
    public static void main(String[] args) {

        /*

            Person - class blueprint
            P ref Variable
            New Person() - Object Real
            OOPs concept

         */

        Person_Class p = new Person_Class();
        p.name = "Hasan ALi";
        System.out.println(p.name);

        Person_Class p1 = new Person_Class();
        p1.name =  "Mohammed";
        System.out.println(p1.name);


        Person_Class t = new Person_Class();
        t.phoneNumber = 100055523;
        System.out.println(t.phoneNumber);

        Person_Class h = new Person_Class();
        h.height = 178.50D;
        System.out.println(h.height);

        Person_Class a = new Person_Class();
        a.age = 35;
        System.out.println(a.age);

        Person_Class edu = new Person_Class();
        edu.edu_back = "Master in IT";
        System.out.println(edu.edu_back);

        Person_Class addr = new Person_Class();
        addr.address = "Hyderabad, India";
        System.out.println(addr.address);

        Person_Class ge = new Person_Class();
        ge.gender = "Male";
        System.out.println(ge.gender);

        Person_Class e = new Person_Class();
        e.emailId = "georgekaseri22@gmail.com";
        System.out.println(e.emailId);

    }
}

package CoreJava.src.Lab065_To_Lab080_OOPS;

public class Object {
    public static void main(String[] args) {

        /*

            Person - class blueprint
            P ref Variable
            New Person() - Object Real
            OOPs concept

         */

        Person p = new Person();
        p.name = "Hasan ALi";
        System.out.println(p.name);

        Person p1 = new Person();
        p1.name =  "Mohammed";
        System.out.println(p1.name);


        Person t = new Person();
        t.phoneNumber = 100055523;
        System.out.println(t.phoneNumber);

        Person h = new Person();
        h.height = 178.50D;
        System.out.println(h.height);

        Person a = new Person();
        a.age = 35;
        System.out.println(a.age);

        Person edu = new Person();
        edu.edu_back = "Master in IT";
        System.out.println(edu.edu_back);

        Person addr = new Person();
        addr.address = "Hyderabad, India";
        System.out.println(addr.address);

        Person ge = new Person();
        ge.gender = "Male";
        System.out.println(ge.gender);

        Person e = new Person();
        e.emailId = "georgekaseri22@gmail.com";
        System.out.println(e.emailId);

    }
}

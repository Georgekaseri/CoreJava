package CoreJava.src.Lab065_To_Lab080_OOPS;

public class Lab067_Person_Object {
    public static void main(String[] args) {

        /*

            Person - class blueprint
            P ref Variable
            New Person() - Object Real
            OOPs concept

         */

        Lab067_Person_Class p = new Lab067_Person_Class();
        p.name = "Hasan ALi";
        System.out.println(p.name);

        Lab067_Person_Class p1 = new Lab067_Person_Class();
        p1.name =  "Mohammed";
        System.out.println(p1.name);


        Lab067_Person_Class t = new Lab067_Person_Class();
        t.phoneNumber = 100055523;
        System.out.println(t.phoneNumber);

        Lab067_Person_Class h = new Lab067_Person_Class();
        h.height = 178.50D;
        System.out.println(h.height);

        Lab067_Person_Class a = new Lab067_Person_Class();
        a.age = 35;
        System.out.println(a.age);

        Lab067_Person_Class edu = new Lab067_Person_Class();
        edu.edu_back = "Master in IT";
        System.out.println(edu.edu_back);

        Lab067_Person_Class addr = new Lab067_Person_Class();
        addr.address = "Hyderabad, India";
        System.out.println(addr.address);

        Lab067_Person_Class ge = new Lab067_Person_Class();
        ge.gender = "Male";
        System.out.println(ge.gender);

        Lab067_Person_Class e = new Lab067_Person_Class();
        e.emailId = "georgekaseri22@gmail.com";
        System.out.println(e.emailId);

    }
}

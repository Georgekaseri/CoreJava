package CoreJava.src.Lab065_To_Lab073_OOPS;

public class EmployeesList_Class {

    // Attribute

    String Name;
    long phoneNumber;
    int EmpId;
    String address;
    String emailID;

    // Behavior / Method
    void work(){
        System.out.println("They work");
    }
    void printDetails(){
        System.out.println(Name);
        System.out.println(phoneNumber);
        System.out.println(EmpId);
        System.out.println(address);
        System.out.println(emailID);
    }


}

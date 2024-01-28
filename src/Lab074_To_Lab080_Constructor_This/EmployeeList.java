package CoreJava.src.Lab074_To_Lab080_Constructor_This;

public class EmployeeList {

    String employeeName;
    long employeePhone;
    String employeeAddress;

    public void printInfo(){
        System.out.println(this.employeeName);
        System.out.println(this.employeePhone);
        System.out.println(this.employeeAddress);
    }


    public static void main(String[] args) {

        EmployeeList e1 = new EmployeeList();
        e1.employeeName = "Yasmeen";
        e1.employeePhone = 68545754;
        e1.employeeAddress = "Begum peet";

        EmployeeList e2 = new EmployeeList();
        e2.employeeName = "Hasan ALi";
        e2.employeePhone = 98658645;
        e2.employeeAddress = "Hyderbad";

        e1.printInfo();
        e2.printInfo();



    }
    }

package CoreJava.src.Lab073_To_Lab083_OOPS_Part2.Non_Parameterized_Constructor;

public class EmployeeList {

    String employeeName;
    long employeePhone;
    String employeeAddress;

    EmployeeList(){
        System.out.println("This is Non-Constructor");
    }

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



        e1.printInfo();




    }
    }

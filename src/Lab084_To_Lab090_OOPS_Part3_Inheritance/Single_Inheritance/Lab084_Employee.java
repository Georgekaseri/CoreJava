package CoreJava.src.Lab084_To_Lab090_OOPS_Part3_Inheritance.Single_Inheritance;

public class Lab084_Employee {
    void salary(){
        System.out.println("Salary = 75000");
    }
}

class Programmer extends Lab084_Employee {
    void bonus() {
        System.out.println("Bonus = 15000");
    }


        public static void main(String[] args) {

            Programmer p = new Programmer();
            p.salary();
            p.bonus();
        }
    }


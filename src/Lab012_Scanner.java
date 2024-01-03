package CoreJava.src;

import java.util.Scanner;

public class Lab012_Scanner {
    public static void main(String[] args) {
    Scanner NewScanner = new Scanner(System.in);

    /*
    Petrol exp
    Grocery exp
    Electricity bill
    Water bill
    office Rent
    Rec Rent
    Total Monthly Expenses
     */


        System.out.println(" ********************** Enter your monthly expenses ********************** ");

        System.out.println("Add Salary");
        int AddSalary = NewScanner.nextInt();

        System.out.println("Rent Receive");
        int RentIncome = NewScanner.nextInt();

        System.out.println("Enter your monthly Petrol exp ");
        int petrolExp = NewScanner.nextInt();

        System.out.println("Enter monthly Grocery");
        int GroceryExp = NewScanner.nextInt();

        System.out.println("Enter Monthly Electricity Bill");
        int ElectricityBill = NewScanner.nextInt();

        System.out.println("Enter Monthly Water Bill");
        int WaterBill = NewScanner.nextInt();

        System.out.println("Enter Office Rent");
        int OfficeRent = NewScanner.nextInt();

        int grossincome = AddSalary + RentIncome;
        System.out.println("Total Monthly Income " + grossincome);

        int MonthlyExp = petrolExp + GroceryExp + ElectricityBill + WaterBill + OfficeRent;
        System.out.println("Total Monthly Expenses " + MonthlyExp);

        int netcome = grossincome - MonthlyExp;
        System.out.println("Monthly saving " + netcome);























    }
}

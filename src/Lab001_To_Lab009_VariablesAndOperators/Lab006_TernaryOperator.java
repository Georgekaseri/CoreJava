package CoreJava.src.Lab001_To_Lab009_VariablesAndOperators;

public class Lab006_TernaryOperator {
    public static void main(String[] args) {

        // Condition Ternary Operator
//
        int a = true ? 50 : 60;
        System.out.println(a);


        int x = (65>50) ? 65 : 50;
        System.out.println(x);


        String  st = false ? "You are allow" : "You are not allow";
        System.out.println(st);


        int YasmeenSales = 25000;
        int HasanSales = 50000;
        int MaxSales = YasmeenSales > HasanSales ? YasmeenSales : HasanSales;
        System.out.println(MaxSales);


        String MarriageSatues = false ? "You are married" : " You are not married";
        System.out.println(MarriageSatues);

        String TodayCricketStatus = true ? "You can Play Cricket today" : "You can not play today";
        System.out.println(TodayCricketStatus);


        String status = false ? "You can " : "You are not";
        System.out.println(status);

        int a1 = 5000;
        int b = 70000;
        int c = 100;

        int max = (a1>b) ? ((a1 > c ) ? a1 : c) :((b > c) ? b : c);
        System.out.println("This  is maximum number in this group is " + max);



    }
}

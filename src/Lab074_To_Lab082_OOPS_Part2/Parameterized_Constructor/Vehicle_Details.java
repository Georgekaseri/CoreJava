package CoreJava.src.Lab074_To_Lab082_OOPS_Part2.Parameterized_Constructor;

public class Vehicle_Details {
    String NumberPlate;
    String CarMake;
    String CarModel;
    int CarYear;
    String CarFirstRegistered;
    String CarColour;

    // Overloading
    public void PrintCarInfo1(String NumberPlate) {
        System.out.println("Car Registration Number : " + NumberPlate);

    }

    public void PrintCarInfo1(String CarMake, String NumberPlate) {
        System.out.println("Car Model : " + CarMake);
    }

    Vehicle_Details(String NumberPlate, String CarMake, String CarModel, int CarYear, String CarFirstRegistered, String CarColour) {
        this.NumberPlate = NumberPlate;
        this.CarMake = CarMake;
        this.CarModel = CarModel;
        this.CarYear = CarYear;
        this.CarFirstRegistered = CarFirstRegistered;
        this.CarColour = CarColour;

    }

    public static void main(String[] args) {

        Vehicle_Details v1 = new Vehicle_Details("KS22 MKL", "Toyota","Auries", 2022, "22 Jul 2022","Black");
        v1.PrintCarInfo1(v1.NumberPlate, v1.CarColour);
    }
}


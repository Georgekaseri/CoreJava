package CoreJava.src.Lab074_To_Lab080_Constructor_This;

public class VehicleDetails {
    String PlateNo;
    String Make;
    String Model;
    int Year;
    String FirstRegistered;
    String Colour;

    public void PrintCarInfo(){
        System.out.println("Car Registration Number : " + this.PlateNo);
        System.out.println("Make : " + this. Make);
        System.out.println("Name of the Model : " + this.Model);
        System.out.println("Registration Year : " + this.Year);
        System.out.println("First Registered  : " + this.FirstRegistered);
        System.out.println("Car Colour  : " + this.Colour);
    }
    VehicleDetails(String PlateNo, String Make, String Model, int Year, String FirstRegistered, String Colour){
        this.PlateNo = PlateNo;
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this. FirstRegistered = FirstRegistered;
        this.Colour = Colour;

    }
    public static void main(String[] args) {

        VehicleDetails v1 = new VehicleDetails("RK09YNS", "Toyota", "Auris", 2009, "07 March 2009", "Grey");
        VehicleDetails v2 = new VehicleDetails("MF58GLZ", "Renault", "Clio", 2008, "24 Sep 2008", "Colour");

v1.PrintCarInfo();
v2.PrintCarInfo();
    }
    }


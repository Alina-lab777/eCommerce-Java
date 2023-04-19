package JavaClass26;

public class Chaika extends Vehicle2 implements TireFactory2 {

    Chaika(String nameOfTheVehicle2, String typeOfTheVehicle2, int weightOfTheVehicle, int yearOfManufacture2, int priceOfTheVehicle2) {
        super(nameOfTheVehicle2, typeOfTheVehicle2, weightOfTheVehicle, yearOfManufacture2, priceOfTheVehicle2);
    }


    @Override
    public boolean typeOfTheTireRequired() {
        System.out.println("For Chaika we need all season tires");
        return false;
    }

}
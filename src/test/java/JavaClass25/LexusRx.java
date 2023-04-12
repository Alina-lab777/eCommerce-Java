package JavaClass25;

public class LexusRx extends Vehicle implements TireFactory {


    LexusRx(String nameOfTheVehicle, String countryOfManufacture, int yearOfManufacture, int priceOfTheVehicle) {
        super(nameOfTheVehicle, countryOfManufacture, yearOfManufacture, priceOfTheVehicle);
    }

    @Override
    public boolean typeOfTiresRequested() {
        System.out.println("The Type of Tire needed for LexusRx should be the best");
        return false;
    }
}

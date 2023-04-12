package JavaClass25;

public class MercedesBenz extends Vehicle implements TireFactory {


    MercedesBenz(String nameOfTheVehicle, String countryOfManufacture, int yearOfManufacture, int priceOfTheVehicle) {
        super(nameOfTheVehicle, countryOfManufacture, yearOfManufacture, priceOfTheVehicle);
    }

    @Override
    public boolean typeOfTiresRequested() {
        System.out.println("For MercedesBenz we need all year round tires are needed");
        return true;
    }
}

package JavaClass25;

public class HondaCivic extends Vehicle implements TireFactory{

   HondaCivic(String nameOfTheVehicle, String countryOfManufacture, int yearOfManufacture, int priceOfTheVehicle) {
      super(nameOfTheVehicle, countryOfManufacture, yearOfManufacture, priceOfTheVehicle);

   }


   @Override
   public boolean typeOfTiresRequested() {
      System.out.println("The type of Tire needed for Honda Civic should be tire for racing");
      return false;
   }
}


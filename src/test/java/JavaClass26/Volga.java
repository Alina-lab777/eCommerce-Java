package JavaClass26;

    public class Volga extends Vehicle2 implements TireFactory2 {

        Volga (String nameOfTheVehicle2, String typeOfTheVehicle2, int weightOfTheVehicle, int yearOfManufacture2, int priceOfTheVehicle2) {
            super(nameOfTheVehicle2, typeOfTheVehicle2, weightOfTheVehicle, yearOfManufacture2, priceOfTheVehicle2);
        }


        @Override
        public boolean typeOfTheTireRequired() {
            System.out.println("For Volga we need all year around tires");
            return false;
        }
    }







package JavaClass25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDrive {

    public static void main(String[] args) {

        HashMap <Integer, Vehicle> salesInfoInStore = new HashMap<>();


        MercedesBenz mercedesBenz = new MercedesBenz("Mercedes", "Germany", 2023, 100000);

        MercedesBenz car2 = new MercedesBenz("Merc", "Germany", 2011, 50000);

        System.out.println( mercedesBenz.numberOfTiresForSedanVehicle());
        System.out.println(mercedesBenz.typeOfTiresRequested());

        LexusRx lexusRx = new LexusRx("LexusRx350", "Japan", 2022, 60000);

        HondaCivic civic = new HondaCivic("HondaCivic", "Japan", 2003, 4000);

        salesInfoInStore.put(101, mercedesBenz);
        salesInfoInStore.put(202, lexusRx);
        salesInfoInStore.put(303, car2);
        salesInfoInStore.put(404, civic);



        //  System.out.println(salesInfoInStore);

        //entrySet() --- extract all put Key + Values; and returns  Map of Entries <Key, Value>
       for (Map.Entry<Integer, Vehicle> extractedFromHashMap : salesInfoInStore.entrySet()){
          // System.out.println("All the keys : " + extractedFromHashMap.getKey());
          // System.out.println("All the Values : " + extractedFromHashMap.getValue());//still some memory location;
           Vehicle vehicle = extractedFromHashMap.getValue();
           System.out.println("All the Sales Id's : " + extractedFromHashMap.getKey() + " " + vehicle.nameOfTheVehicle +" "+
                                vehicle.countryOfManufacture + " "+ vehicle.yearOfManufacture +" "+ vehicle.priceOfTheVehicle);
       }




       // applyDiscountAmountWithForEachLoop(salesInfoInStore, 5);
      //  applyDiscountAmountWithForEachLoop(salesInfoInStore, 10);
      //  applyDiscountAmountWithForEachLoop(salesInfoInStore, 7);
      //  applyDiscountForOlderCars(salesInfoInStore,20);
       // applyDiscountForOlderCars(salesInfoInStore, 10, 10);
        applyDiscountForNonGermanCars(salesInfoInStore, 20,  "Germany");
       // We need to apply 10% off for all the Car prices:
        /*for (Map.Entry<Integer, Vehicle> applyDiscount : salesInfoInStore.entrySet()) {

            Vehicle vehicle = applyDiscount.getValue();

            vehicle.priceOfTheVehicle = vehicle.priceOfTheVehicle - vehicle.priceOfTheVehicle * 15/100;
            System.out.println("All the Sales Id's with Discounts : " + applyDiscount.getKey() + " " + vehicle.nameOfTheVehicle +" "+
                    vehicle.countryOfManufacture + " "+ vehicle.yearOfManufacture +" "+ vehicle.priceOfTheVehicle);
        }*/


    }



    // Generic Method ---> re-usability with different input parameters but using the same Method:
    // We need to write generic method to apply discounts (every time new price);

    public static void applyDiscountAmountWithForEachLoop (HashMap<Integer,Vehicle> userMap, int amountToDiscount) {
        for (Map.Entry<Integer, Vehicle> applyDiscount : userMap.entrySet()) {

            Vehicle vehicle = applyDiscount.getValue();

            vehicle.priceOfTheVehicle = vehicle.priceOfTheVehicle - vehicle.priceOfTheVehicle * amountToDiscount / 100;
            System.out.println("All the Sales Id's with Discounts : " + applyDiscount.getKey() + " " + vehicle.nameOfTheVehicle + " " +
                    vehicle.countryOfManufacture + " " + vehicle.yearOfManufacture + " " + vehicle.priceOfTheVehicle);
        }

    }
      public static void applyDiscountForOlderCars (HashMap<Integer, Vehicle> userMap, int amountToDiscount){

        for (Map.Entry<Integer, Vehicle> applyDiscountForOldCars : userMap.entrySet()){
            Vehicle vehicle = applyDiscountForOldCars.getValue();

            if (vehicle.yearOfManufacture < 2015) {
                vehicle.priceOfTheVehicle = vehicle.priceOfTheVehicle - vehicle.priceOfTheVehicle * amountToDiscount/100;
                System.out.println("All the Sales Id's with Discounts : " + applyDiscountForOldCars.getKey() + " " + vehicle.nameOfTheVehicle + " " +
                        vehicle.countryOfManufacture + " " + vehicle.yearOfManufacture + " " + vehicle.priceOfTheVehicle);
            }
        }
    }

    public static void applyDiscountForOlderCars (HashMap<Integer, Vehicle> userMap, int amountToDiscountForAll, int extraDiscountOldCar){

        for (Map.Entry<Integer,Vehicle> applyDiscount : userMap.entrySet()){
            Vehicle vehicle = applyDiscount.getValue();
            vehicle.priceOfTheVehicle = vehicle.priceOfTheVehicle - vehicle.priceOfTheVehicle * amountToDiscountForAll/100;
            if (vehicle.yearOfManufacture<2015){
                vehicle.priceOfTheVehicle = vehicle.priceOfTheVehicle - vehicle.priceOfTheVehicle * extraDiscountOldCar/100;
            }
            System.out.println("All the Sales Id's with All Discounted price and Extra discount : " + applyDiscount.getKey() + " " + vehicle.nameOfTheVehicle + " " +
                    vehicle.countryOfManufacture + " " + vehicle.yearOfManufacture + " " + vehicle.priceOfTheVehicle);
        }

    }


    public static void applyDiscountForNonGermanCars (HashMap<Integer,Vehicle> userMap, int amountToDiscount, String manufactureCountry ) {
        for (Map.Entry<Integer, Vehicle> applyDiscount : userMap.entrySet()) {

            Vehicle vehicle = applyDiscount.getValue();

            vehicle.priceOfTheVehicle = vehicle.priceOfTheVehicle - vehicle.priceOfTheVehicle * amountToDiscount / 100;
            if (!vehicle.countryOfManufacture.equalsIgnoreCase("Germany"))
                System.out.println("All the Sales Id's with Discounts for Non German Cars  : " + applyDiscount.getKey() + " " + vehicle.nameOfTheVehicle + " " +
                    vehicle.countryOfManufacture + " " + vehicle.yearOfManufacture + " " + vehicle.priceOfTheVehicle);
        }

    }




}





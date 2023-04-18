package JavaClass26;

import JavaClass25.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class TestDrive2 {

    public static void main(String[] args) {

        HashMap<Integer, Vehicle2> antiqueCarsInventoryList = new HashMap<>();

        Chaika chaika = new Chaika("Chaika134A", "Premium Sedan", 2100, 1972,65000 );

        Vaz vaz = new Vaz("Vaz2107", "Regular Sedan", 1030, 1980, 5500);

        Volga volga = new Volga("Volga3110", "Regular Sedan", 1350, 1960, 13000);

        Zil zil = new Zil("Zil114", "Premium Sedan", 1900, 1950, 40000);


       antiqueCarsInventoryList.put(101, chaika);
       antiqueCarsInventoryList.put(102, vaz);
       antiqueCarsInventoryList.put(103, volga);
       antiqueCarsInventoryList.put(104, zil);


        for (Map.Entry<Integer, Vehicle2> extractedFromHashMap2 : antiqueCarsInventoryList.entrySet()){
         Vehicle2 vehicle2 = extractedFromHashMap2.getValue();

            System.out.println("All the inventory ID's : " + extractedFromHashMap2.getKey() +" "+vehicle2.nameOfTheVehicle2 +" "+
                    vehicle2.typeOfTheVehicle2 +" "+ vehicle2.weightOfTheVehicle +" "+ vehicle2.yearOfManufacture2 +" "+ vehicle2.priceOfTheVehicle2);

        }

        applyFeeForOlderCars(antiqueCarsInventoryList,10, 1970, 5,4);

    }



public static void applyFeeForOlderCars (HashMap<Integer,Vehicle2> userMap, int FeesApplied, int yearOfManufacture, int extraFeesAppliedForPremiumCars, int extraFeesAppliedForOverWeightCars) {
        for(Map.Entry<Integer, Vehicle2> fee : userMap.entrySet()) {

         Vehicle2 vehicle2 = fee.getValue();

         if (vehicle2.yearOfManufacture2<1970) {
             vehicle2.priceOfTheVehicle2 = vehicle2.priceOfTheVehicle2 + vehicle2.priceOfTheVehicle2 * FeesApplied/100;

             if (vehicle2.weightOfTheVehicle>1500) {
                 vehicle2.priceOfTheVehicle2 = vehicle2.priceOfTheVehicle2 + vehicle2.priceOfTheVehicle2 * extraFeesAppliedForOverWeightCars/100;

             } if(vehicle2.typeOfTheVehicle2.equalsIgnoreCase("Premium Sedan")) {
                 vehicle2.priceOfTheVehicle2 = vehicle2.priceOfTheVehicle2 + vehicle2.priceOfTheVehicle2 * extraFeesAppliedForPremiumCars/100;

             } System.out.println("All the inventory ID's with Extra fees applied : " + fee.getKey() + " " + vehicle2.nameOfTheVehicle2 + " " +
                     vehicle2.typeOfTheVehicle2 + " " + vehicle2.weightOfTheVehicle + " " + vehicle2.yearOfManufacture2 + " " + vehicle2.priceOfTheVehicle2);

              }
        }
}






















}

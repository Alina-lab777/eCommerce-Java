package JavaClass25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDrive {

    public static void main(String[] args) {

        HashMap <Integer, Vehicle> salesInfoInStore = new HashMap<>();


        MercedesBenz mercedesBenz = new MercedesBenz("Mercedes", "Germany", 2023, 100000);

        System.out.println( mercedesBenz.numberOfTiresForSedanVehicle());
        System.out.println(mercedesBenz.typeOfTiresRequested());

        LexusRx lexusRx = new LexusRx("LexusRx350", "Japan", 2022, 60000);


        salesInfoInStore.put(101, mercedesBenz);
        salesInfoInStore.put(202, lexusRx);


        //  System.out.println(salesInfoInStore);

        //entrySet() --- extract all put Key + Values; and store in Map of Entry <Key, Value>
        Set <Map.Entry<Integer, Vehicle>> extractedValues = salesInfoInStore.entrySet();
        System.out.println(extractedValues);






    }

}

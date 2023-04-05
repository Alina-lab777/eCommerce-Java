package JavaClass22.Abstract;

public interface TireFactory {

    public static String someStaticVar = "static string";
    final int factoryId = 112233;



    default int numberOfTiresNeeded (int numberOfTire){
        System.out.println("The number of tires needed to the customer : " + numberOfTire );
        return numberOfTire;
    }


     int numberOfTiresNeeded();


    }



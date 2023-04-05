package JavaClass22.Abstract;

public class Audi extends Vehicle implements TireFactory, TypeOfEngine {


    public int gasTankVolumeInGallons(int varInBMW) {
        System.out.println("This is Body Implementation in  Audi class");
        return varInBMW;
    }


    public int enginePower() {
        System.out.println("This is Body Implementation in Audi class 2 method");
        return 22;
    }


    public int numberOfTiresNeeded() {
        System.out.println("This is method Implemented from Tires Interface");
        return 4;
    }

    @Override
    public void typeOfEngine() {
        System.out.println("The type of Engine needed for Audi is Hybrid");
    }
}

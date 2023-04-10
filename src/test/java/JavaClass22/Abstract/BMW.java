package JavaClass22.Abstract;

public class BMW extends Vehicle implements TireFactory, TypeOfEngine {

    public int gasTankVolumeInGallons(int theTankVolume) {
        System.out.println("This is Body Implementation in  BMW class");

       int theTankVolumeInMethod = 0;
        if (theTankVolume>=10){
           theTankVolumeInMethod=10;
            System.out.println(theTankVolumeInMethod);
        } else if (theTankVolume >=20){
            System.out.println("It less than 20");
        } else if (theTankVolume >=50){
            System.out.println("50");
        }
        return theTankVolume;
    }


    protected int enginePower() {
        System.out.println("This is Body Implementation in BMW class 2 method");
        return 20;
    }

    @Override
    public int numberOfTiresNeeded() {
        System.out.println("This is method Implemented from Tires Interface");
        return 4;
    }

    @Override
    public void typeOfEngine() {
        System.out.println("This is method from type of Engine interface and needed for BMW is Diesel");



    }
}

package JavaClass25;

public interface TireFactory {

    //Abstract method without Body implementation;
    public boolean typeOfTiresRequested();


    //Default method, we gave the Body within Interface;
    default int numberOfTiresForSedanVehicle(){
        System.out.println("The Default Number of Tires needed are 4");
        return 4;
    }

}

package JavaClass26;

public abstract class Vehicle2 {

    String nameOfTheVehicle2;
    String typeOfTheVehicle2;
    int weightOfTheVehicle;
    int yearOfManufacture2;
    int priceOfTheVehicle2;



    Vehicle2(String nameOfTheVehicle2, String typeOfTheVehicle2, int weightOfTheVehicle, int yearOfManufacture2, int priceOfTheVehicle2 ) {
        this.nameOfTheVehicle2=nameOfTheVehicle2;
        this.typeOfTheVehicle2=typeOfTheVehicle2;
        this.weightOfTheVehicle=weightOfTheVehicle;
        this.yearOfManufacture2=yearOfManufacture2;
        this.priceOfTheVehicle2=priceOfTheVehicle2;



    }


    public Vehicle2() {

    }

    /**
     * If there are Parametrized Constructor, and child IS extending the parent, child should call it with
     * super() keyword;
     * else we need to create default constructor in Parent class;
     * */





}

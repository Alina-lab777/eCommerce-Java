package JavaClass25;

public abstract class Vehicle {

    String nameOfTheVehicle;
    String countryOfManufacture;
    int yearOfManufacture;
    int priceOfTheVehicle;


    //This is Parameterized Constructor, defined/created by user;
    Vehicle(String nameOfTheVehicle, String countryOfManufacture, int yearOfManufacture,int priceOfTheVehicle){
        this.nameOfTheVehicle=nameOfTheVehicle;
        this.countryOfManufacture=countryOfManufacture;
        this.yearOfManufacture=yearOfManufacture;
        this.priceOfTheVehicle=priceOfTheVehicle;

    }

    //This is Default Constructor, defined by user;
    public Vehicle() {

    }

    /**
     *
     * If there are Parameterized Constructor, and Child is extending the Parent, child should call it with
     *      super() keyword;
     *      else we need to create default constructor in Parent class;
     *
     **/




}

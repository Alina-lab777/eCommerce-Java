package JavaClass19;

import JavaClass19.Animal.Dog;
import JavaClass19.Banks.BankOfAmerica;
import JavaClass19.Banks.CitiBank;
import JavaClass19.Banks.FED;

public class JavaClassWork19 {


    /**
     * Inheritance ---> mechanism, in which one object acquires all properties and behaviours from
     * another (Parent) class. It is OOPs (Object Programming System)
     *
     *
     * "extends" keyword;
     * "super" ---> we can call Parent properties and get everything from the Super class;
     *
     * Class extends another class:
     *          (Parent, Super class) ---> from where all subclasses inherits the properties
     *          (Child class,SubClass) ----> the class which gets an access to all properties from Parent class;
     *
     *
     **/



    /**
     * Single Inheritance ---> when the relationship is set 1 to 1 ; (When one class extends another class)
     *
     * Multilevel Inheritance ---> when A class is being extended by B class, and B class being extended by C class;
     *
     * Diamond Problem --->
     **/


    public static void main(String[] args) {

        FED fed = new FED();
        System.out.println("The initial FED rate : " + fed.baseRateOfInterest());


        BankOfAmerica boa = new BankOfAmerica();
        System.out.println("Base rate for BoA is : " + boa.baseRateOfInterest());


        System.out.println(boa.baseRateOfInterest1111(10, 20));


        CitiBank citi = new CitiBank();
        System.out.println("The Citi rate : " + citi.baseRateOfInterest() );




        Dog dog = new Dog();
        dog.setTypeInfo("Mammal","DogBreed", 3);
        System.out.println(dog.toString());





    }

}

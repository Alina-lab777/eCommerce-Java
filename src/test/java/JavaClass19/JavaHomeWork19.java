package JavaClass19;

import JavaClass19.Animal.Dog;
import JavaClass19.Animal.Puppy;
import JavaClass19.Banks.BankOfAmerica;
import JavaClass19.Banks.CitiBank;
import JavaClass19.Banks.FED;

public class JavaHomeWork19 {

    /**
     * 1. Create one Method in Animal Class named jump() in Animal Class, override it in Dog class; --- overriding
     * 2. Create another jump() method in  Dog class, that accepts number of jumps as a parameter; --- overloading
     * 3. Create one method jump() in Puppy and override it; --- overriding
     * 4. Create another method jump() in Puppy,  that accepts 2 parameters as 1)Number of jumps; 2) Age of puppy; --- overloading
     *
     **/

    /**
     * Inheritance ----> mechanism, in which one object acquires  all properties and behaviours
     * another class (Parent) class. It is OOPs (Object Programming System)
     *
     * "extends" keyword;
     * "super" ---> we can call Parent properties and get everything from super class;
     *
     * Class extends another class: (Parent, Super class----> from where all subclasses inherit the properties.
     * Child Class, Subclass------> the class which gets access to all properties from Parent class.
     *
     * */

    public static void main(String[] args) {

        FED fed = new FED();
        System.out.println("THe initial FED rate123: " + fed.baseRateOfInterest());


        BankOfAmerica boa = new BankOfAmerica();
        System.out.println("Base rate123 for BOA  : " + boa.baseRateOfInterest());

        System.out.println( boa.baseRateOfInterest1111(10, 20));

        CitiBank citi = new CitiBank();
        System.out.println("Base rate for citi : " + citi.baseRateOfInterest());

        Dog dog = new Dog();
        dog.setTypeInfo("Mammal", "DogBRead", 3);
        System.out.println(dog.toString());

        dog.jump(120);

        Puppy puppy = new Puppy();
        puppy.jump(110,3);



    }





}

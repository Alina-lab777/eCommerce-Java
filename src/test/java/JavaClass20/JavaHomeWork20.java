package JavaClass20;

import java.util.SplittableRandom;

public class JavaHomeWork20 {

    /**
     * Polymorphism ---> many forms, and it occurs when we have many classes that related to each other by
     * inheritance. In Java Polymorphism is used to perform different tasks.
     * <p>
     * <p>
     * TYPES:
     * <p>
     * 1. Compile-time polymorphism ---> static binding, this applies only to "method overloading";
     * <p>
     * <p>
     * 2. Run-time polymorphism ---> dynamic binding, this can be achieved only in Parent-Child relationship;
     * when the Child class inherits all properties and changes its behaviour by "method overriding";
     **/


    public JavaHomeWork20(String username) {
    }

    //  public JavaHomeWork20(){}; // no-arg/default constructor;

    public void constructor (String password){
        System.out.println("This is password : " + password);
    }

    public JavaHomeWork20(int age, int phoneNumber){
        System.out.println("User Info");
    }

    private int SSN (int userSSN){
        System.out.println("This is User's SSN : " + userSSN);
        return userSSN;
    }

}

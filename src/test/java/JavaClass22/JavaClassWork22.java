package JavaClass22;

import JavaClass22.Abstract.Audi;

public class JavaClassWork22 {

    /**
     * Abstract Class in Java ---> it is type of Java class, that can have regular methods ds well as abstract methods
     * abstract ---> no body implementation/no method body;
     *
     *
     * KeyPoints to remember:
     *
     * 1. It has to be declared with the keyword "abstract";
     * 2. We can't create an object of an Abstract class/can't be instantiated;
     * 3. It can have constructors and static methods;
     * 4. It can have final methods;
     * 5. The subclass extending Abstract class, must provide/implement for abstract methods in IS-relationship;
     * 6. Abstract class can extend another Abstract class, if there are abstract methods, the Abstract class may not
     * provide/implement the method body;
     * 7. All Access modifiers can be declared in abstract class;
     **/


    /**
     * Java Interface ---> it is not a class, it is mechanism to achieve partial abstraction.
     *                      It is used to achieve multiple inheritance in Java;
     *
     *   KeyPoint to remember:
     *
     *   1. It can't have constructor;
     *   2. We use keyword "implements";
     *   3. It can have normal methods without body implementation, the Java class implementing Interfaces must provide its body;
     *   4. It can have only "final" and "static" field variables, (only public access modifier is allowed);
     *   5. It can have "default" methods, that comes with method implementation by default;
     *   6. Can't be instantiated; ---> can't create an Object;
     *   7. We can achieve multiple inheritance by indicating many Interfaces after keyword "implements" in Java class;
     *
     *
     **/


    /**
     * "final" keyword CANNOT BE overwritten or changed; as per the methods and field declared variables;
     *
     **/


    /**
     * private ---> protected ---> default ---> public
     *
     **/


    public static void main(String[] args) {

        Audi audi = new Audi();


     /**
      *  1. Provide Body to protected int enginePower() method in BWM Class
      *  2. Implement TireFactory, TypeOfEngine in BWM class;
      *  3. Provide body implementation for all prompted methods;
      *  4. RE-WATCH THIS RECORDING!
      *
      **/



    }
}

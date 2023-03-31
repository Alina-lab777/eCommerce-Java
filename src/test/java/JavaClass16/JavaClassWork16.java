package JavaClass16;

public class JavaClassWork16 {
    /**
     * Types of Methods:
     *
     * 1. Pre-defined methods (in-built) ---> exists within the JDK (Java Development Kit);
     * 2. User-defined methods ---> generic methods, all the methods written by the programmer;
     *
     **/


    /**
     * Method Signature ---> consists of a name and parameter list (number of Input parameters,
     *                                                              types of Input Parameters,
     *                                                              order of Input Parameters)
     **/


    /**
     * Method Overloading ---> meaning, the method Name is exactly the same, but Input Parameters are different;
     *
     **/

    /**
     * Static ---> is accessible without creating Object of a Class (applies to Variables, Methods)
     **/


    public static Integer staticNumber = 1010;

    public static String methodThatChecksTheCarLength(String car) {
        if (car.length() > 6) {
            System.out.println("Car brand name length is more than 6 : " + car);
        } else if (car.length() < 4) {
            System.out.println("Car brand name length is less than 4 : " + car);
        } else {
            System.out.println("Car brand name leftovers : " + car);
        }
        return car;
    }



    public static String methodThatChecksTheCarLength (String car1, String car2) {
        if (car1.length()> 6){
            System.out.println("Car brand name length is more than 6 : " + car1);

        }
        if (car2.length()> 6) {
            System.out.println("Car brand name length is more than 6 : "  + car2);

        }
        if (car1.length() <= 4) {
            System.out.println("Car brand name length is less than 4 : " + car1);

        }
        if (car2.length() <= 4 ) {
            System.out.println("Car brand name length is less than 4 : " + car2);
        }
        return car1;
    }





    public static void main(String[] args) {

        // 1 Input Parameter:

        methodThatChecksTheCarLength("Mercedes");


       System.out.println("========================================");

        // 2 Input parameters:
        methodThatChecksTheCarLength("Volkswagen", "BWM");



        System.out.println("Static number in class 16 : " + staticNumber);


    }


}






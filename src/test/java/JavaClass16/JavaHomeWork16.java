package JavaClass16;

public class JavaHomeWork16 {

    /**
     * types of methods:
     * 1. Pre-defined or in Built method, existent within JVM
     * <p>
     * 2. User Defined method, used builds it adn sets conditions. They could include generic method
     * anf all the methods written by programmer.
     * <p>
     * 3. Method Parameters are inputs that we define within the parenthesis.
     * <p>
     * 4. Method Signature defines the logic of method is consists of:
     * name, parameters list inputs of (x=10, y =12), types(String,int) of and order Numbers(firstNAme, LastName);
     * "public static String methodThatChecksTheCarLength (String car)"
     * <p>
     * 5. Void - won't return anything;
     * <p>
     * 6. Method Overloading: method name is the same with different logic input parameters.
     * <p>
     * 7. Static--- is accessible without creating Object of the Class (applies to Variables, Methods)
     */


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

    public static String methodThatChecksTheCarLength(String car1, String car2) {
        if (car1.length() > 6) {
            System.out.println("Car brand name length is more than 6 : " + car1);
        }
        if (car2.length() > 6) {
            System.out.println("Car brand name length is more than 6 : " + car2);
        }
        if (car1.length() <= 4) {
            System.out.println("Car brand name length is less than 4 : " + car1);
        }
        if (car2.length() <= 4) {
            System.out.println("Car brand name length is less than 4 : " + car2);
        }
        return car1;
    }

    public static Integer staticNumber = 1010;


    public static String methodFlowers(String flower) {
        if (flower.endsWith("n")) {
            System.out.println("The result of flower, that endsWith(n) " + flower);

        }
        return flower;
    }

    public static String methodFlowers(String flower1, String flower2) {
        if (flower1.startsWith("a")) {
            System.out.println("The result of flower, that startsWith('a'): " + flower1);

        } else {
            System.out.println("Flower doesn't startsWith('a'): " + flower1 + " " + flower2);
        }
        return flower1;
    }

    public static String methodBrand(String brand) {
        if (brand.length() < 6) {
            System.out.println("Brand name is less than 6 " + brand);
        }
        return brand;
    }

    public static String methodBrand(String brand1, String brand2, String brand3) {
        if (brand1.startsWith("a")) {
            System.out.println("Brand name starts with a " + brand1);
        }
        if (brand2.endsWith("o")) {
            System.out.println("Brand name ends with o " + brand2);
        } else {
            System.out.println("Brand name doesn't ends with a and o " + brand3);
        }
        return brand1;

    }


    public static void main(String[] args) {


        methodThatChecksTheCarLength("Mercedes");
        methodThatChecksTheCarLength("Audi", "Volkswagen");

        methodFlowers("Rose");
        methodFlowers("Orchid", "Daffodil");

        methodBrand("nike");
        methodBrand("adidas", "valentino", "puma");


    }
}
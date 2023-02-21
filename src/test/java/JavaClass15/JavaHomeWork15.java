package JavaClass15;

import JavaClass13.JavaHomeWork13;
import JavaClass14.JavaHomeWork14;

public class JavaHomeWork15 {

    /**
     * Create method that return result of addition two numbers; --- done
     * Create public method that return result of subtraction two numbers;
     * Create public method that return result of multiplication two numbers;
     * Create public method that return result of division two numbers;
     **/

    /**
     * Class vs Object: Car factory vs different cars;
     * <p>
     * Class is blueprint/template/schema of an object. It is used to create an Object.
     * <p>
     * An Object it is the instance (sample,occurrence) of a Java Class.
     * <p>
     * UI vs API automation:
     * <p>
     * In UI Automation testing, specialized tools are used to
     * validate button clicks, navigation's, data entries, enables communication
     * between the end-users API For testing the application’s business logic
     * <p>
     * Syntax to create an Object: JavaClassWork13 obj = new JavaClassWork13;
     * <p>
     * Class have it own variables (usually defined after class) and methods,
     */


       /*int a=0, b=1, c, count=10;

        for (int i=0; i<count; i++ ) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

        int[] arrayBig = {13, 324, 34, 4, 2, 232, 434, 1534, 1, 324, 35};
        int biggest = 0;

        for (int i = 0; i < arrayBig.length; i++) {
            if (biggest < arrayBig[i]) {   //Is ArrayBig[i] bigger than 0?
                biggest = arrayBig[i];    // If yes take the value;
            }
        }
        System.out.println("Biggest : " + biggest);


        int[] arraySmall = {232, 343, 654, 8, -12, -24, 99, 6, 4, 3, 9, 590};
        int smallest = arraySmall[0];

        for (int i = 0; i < arraySmall.length; i++) {
            if (smallest > arraySmall[i]) { // Is first array bigger than second(343) ?
                smallest = arraySmall[i];    // if yest take the value and continue;
            }
        }
        System.out.println("Smallest : " + smallest);*/

    public int someClassAdc15 = 123;
    private String accMod = "accessModifier";
    int getSomeClassAdc2 = 23123;
    double someDoub = 2323.4324;


    /**
     * Access Modifier --- defines access type of a Class, variable, methods (CLass Properties)
     * 4 Types of Access Modifiers;
     * 1.Public: accessible through the Entire Project;
     * 2.Protected: access within the Package;
     * 3.Private; accessible within the CLASS;
     * 4.Default; defines without any modifier. Accessible within a Package;
     * <p>
     * All access modifiers are applied to Class. Methods, Field Variables;
     * Field/Global VVariables ---defined  after ClassName (on the top)
     * <p>
     * Java Methods-----Method is a Collection of statement that perform some
     * specific task a return result to a caller or not returning anything(void).
     * <p>
     * Syntax---- access modifier >< return type > method .
     * public int max (int x, int y)
     */

    public int methodMaxNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public int addition(int x, int y) {
        int z = x + y;
        return z;
    }

    public int substraction(int x, int y) {
        int z = x - y;
        return z;
    }

    public int multiplication (int x, int y) {
       int z=x*y;
       return z;
    }

    public int division (int x, int y) {
       int  z=x/y;
       return z;
    }

    public static void main(String[] args) {
        System.out.println("==================================================");

        JavaHomeWork15 comparisonMethod = new JavaHomeWork15();
        int method = comparisonMethod.methodMaxNumber(100, 120);
        System.out.println(method);
        int method1 = comparisonMethod.methodMaxNumber(123, 453);
        System.out.println(method1);
        int method2 = comparisonMethod.methodMaxNumber(12, 34);
        System.out.println(method2);
        int method3 = comparisonMethod.methodMaxNumber(132, 543);
        System.out.println(method3);

        System.out.println("=====================================================");


        JavaHomeWork15 additionNew = new JavaHomeWork15();
        int additionresult = additionNew.addition(130, 2412);
        System.out.println(additionresult);
        int additionresult1 = additionNew.addition(23123, 43546);
        System.out.println(additionresult1);
        int additionresult2 = additionNew.addition(231, 3453);
        System.out.println(additionresult2);


        System.out.println("====================SUBTRACTION================================");

        JavaHomeWork15 substarctionNew = new JavaHomeWork15();
        int subResult = substarctionNew.substraction(123, 32);
        System.out.println(subResult);
        int subResult1 = substarctionNew.substraction(121, 456);
        System.out.println(subResult1);
        int subResult2 = substarctionNew.substraction(32423423, 3545);
        System.out.println(subResult2);

        System.out.println("================MULTIPLICATION====================================");

        JavaHomeWork15 newMultiplication = new JavaHomeWork15();
        int multiResult = newMultiplication.multiplication(1232,3434);
        System.out.println(multiResult);
        int multiResult1 = newMultiplication.multiplication(2323,3432);
        System.out.println(multiResult1);

        System.out.println("======================Division======================================");

        JavaHomeWork15 newDivision = new JavaHomeWork15();
        int divResult = newDivision.division(2323,34);
        System.out.println(divResult);
        int divResult1 = newDivision.division(2323,545);
        System.out.println(divResult1);

        System.out.println("==================================================================");

        JavaHomeWork15 object15 = new JavaHomeWork15();
        int MainMethod15 = object15.someClassAdc15;
        System.out.println(MainMethod15);


        JavaHomeWork14 object14 = new JavaHomeWork14();
        int accMod = object14.accessModifier;
        System.out.println(accMod);


        JavaHomeWork15 stringObject = new JavaHomeWork15();
        String newModifier = stringObject.accMod;
        System.out.println(newModifier);


        JavaHomeWork15 newName = new JavaHomeWork15();
        double newName1 = newName.someDoub;
        System.out.println(newName1);


        JavaHomeWork13 oil = new JavaHomeWork13();
        int newOil = oil.someVarClass13;
        System.out.println(newOil);


    }
}






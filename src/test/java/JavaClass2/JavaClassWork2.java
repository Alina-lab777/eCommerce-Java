package JavaClass2;

public class JavaClassWork2 {
    public static void main(String[] args) {


        long[] newArrayTypeData = {2,3,45,55,66,77};
        System.out.println("New Long Data Type" + newArrayTypeData[0]);
        System.out.println(newArrayTypeData[1]);
        System.out.println("New Long Data Type 1 " + newArrayTypeData[2]);
        System.out.println("New Long Data Type 2 " + newArrayTypeData[3]);
        System.out.println("New Long Data Type 3 " + newArrayTypeData[4]);
        System.out.println("New Long Data Type 4 " + newArrayTypeData[5]);

        short[] samsArrayType = {20,30,40,50,60};
        short someShortType = 20;

        System.out.println("First print out " +  samsArrayType[4]);
        System.out.println("Second print out " + samsArrayType[2]);
        System.out.println("This is single line " + someShortType);
        System.out.println("this is 20 from array type " + samsArrayType [0]);
        System.out.println(" Last Print out " + samsArrayType[4]);


        boolean newBoolie = true;
        System.out.println(newBoolie);
        boolean oldBullie = false;
        System.out.println(oldBullie);

        char[] Character = {'a','b','c','d','r','%','?',};
        System.out.println("This is the percentage sign " + Character[5]);
        System.out.println("This is the percentage sign a " + Character[0]);
        System.out.println("This is the percentage sign  b " + Character[1]);
        System.out.println("This is the percentage sign c " + Character[2]);
        System.out.println("This is the percentage sign d " + Character[3]);
        System.out.println("This is the percentage sign r " + Character[4]);
        System.out.println("This is the percentage sign  ? " + Character[6]);


        /**
         *  Practice/declare/assign arrays[] for all  data types and print them by their Index#
         *           * byte
         *           * short
         *           * int
         *           * long
         *           * float
         *           * double
         *           * boolean
         *           * char
         *           * String
         *
         * */


        double[] someArrayOfDouble = {11,22,33,44,55}; // we know, and we are declaring the known values;

        double[] withFixedSize = new double[10]; //this Object can hold 5 values;
        withFixedSize[0] = 12.00;
        withFixedSize[1] = 20.00;
        withFixedSize[2] = 30.00;
        withFixedSize[3] = 33.00;
        withFixedSize[4] = 40.00;
        withFixedSize[5] = 50.00; // this is 6th values;


        System.out.println("Print Size of Fixed Array is : " + withFixedSize.length +"are these :" +
                withFixedSize[0]  + withFixedSize[1] +withFixedSize[2]);


        String[] someFixedString = new String[10];
        someFixedString[0] = "ZeroIndex";
        someFixedString[2] = "SecondIndexValue";
        someFixedString[9] = "LastIndexValue";
        someFixedString[5] = "SixthValue";

        System.out.println("Value Index # 3 : " + someFixedString[3]);

        // Array types once it is declared it is fixed size and we can't change the size;
        // This is the limitation of an Arrays;


        /**
         * 1. Arithmetic Operator:
         * Addition : +
         * Subtraction : -
         * Multiplication : *
         * Division : /
         * Modulus : % ---> This will return the "remainder" of division from two numbers;
         *
         * Increment ++
         * Decrement --
         *
         *
         * 2. Assignment Operator:
         * +=
         * -=
         * *=
         *
         * */

        int a = 170; // will return 4 as whole number and 10 as a remainder;
        int b = 30;

        int c = a + b ;
        int d = a / b ;
        int e = a - b;
        int f = a * b ;
        int g = a % b;

        System.out.println("Addition of two Numbers is : " + c) ;
        System.out.println("Subtraction of two Numbers is : " + e) ;
        System.out.println("Division of two Numbers is : " + d) ;
        System.out.println(" Multiplication of two Numbers is : " + f) ;
        System.out.println(" Modulus of two Numbers is : " + g) ;


        int x = 5;
            x = 10; // reassigned to 10;
            x = x + 20;
          //  x +=3; // x = x + 3;

        System.out.println("Value of x : " + x );

        int y = 10;
           y*=5; // y = 10 * 5;
        System.out.println("Value if mult of y : " + y);


        int z = 100;
            z -= 40; //z = 100 - 40;

        System.out.println("Sub of Value of z : " + z);


    }
}

package JavaClass2;

public class JavaHomeWork2 {

    public static void main(String[] args) {

        System.out.println("*********Repeating Arrays Home Work **************");


        byte[] ArrayByteType = {12, 13, 14, 15, 16,};
        System.out.println("Byte work " + ArrayByteType[0]);
        System.out.println("Byte work " + ArrayByteType[1]);
        System.out.println("byte work " + ArrayByteType[2]);
        System.out.println("byte work " + ArrayByteType[3]);
        System.out.println("byte work " + ArrayByteType[4]);


        System.out.println("*******Home Work****************");

        short[] ArrayShortType = {22, 33, 44, 55, 66,};
        System.out.println("short work " + ArrayShortType[0]);
        System.out.println("short work " + ArrayShortType[1]);
        System.out.println("short work " + ArrayShortType[2]);
        System.out.println("short work " + ArrayShortType[3]);
        System.out.println("short work " + ArrayShortType[4]);


        System.out.println("***********************");


        int[] ArrayIntType = {12, 32, 43, 54, 65,};
        System.out.println("int work " + ArrayIntType[0]);
        System.out.println("int work " + ArrayIntType[1]);
        System.out.println("int work " + ArrayIntType[2]);
        System.out.println("int work " + ArrayIntType[3]);
        System.out.println("int work " + ArrayIntType[4]);


        System.out.println("***********************");


        long[] ArrayLongType = {12, 42, 45, 49, 76,};
        System.out.println("long work " + ArrayLongType[0]);
        System.out.println("long work " + ArrayLongType[1]);
        System.out.println("long work " + ArrayLongType[2]);
        System.out.println("long work " + ArrayLongType[3]);
        System.out.println("long work " + ArrayLongType[4]);


        System.out.println("***********************");


        float[] ArrayFloatType = {53, 34, 33, 12, 32,};
        System.out.println("float work " + ArrayFloatType[0]);
        System.out.println("float work " + ArrayFloatType[1]);
        System.out.println("float work " + ArrayFloatType[2]);
        System.out.println("float work " + ArrayFloatType[3]);
        System.out.println("float work " + ArrayFloatType[4]);


        System.out.println("***********************");


        double[] ArrayDoubleType = {44.00, 45.00, 12.00, 11.30, 12.44,};
        System.out.println("double Work " + ArrayDoubleType[0]);
        System.out.println("double Work " + ArrayDoubleType[1]);
        System.out.println("double Work " + ArrayDoubleType[2]);
        System.out.println("double Work " + ArrayDoubleType[3]);
        System.out.println("double Work " + ArrayDoubleType[4]);


        System.out.println("***********************");


        boolean BooleanType = true;
        System.out.println(BooleanType);


        System.out.println("***********************");


        boolean BooleanType1 = false;
        System.out.println(BooleanType1);


        System.out.println("***********************");


        char[] ArrayCharType = {'a', 'd', 's', 'g', 'h',};
        System.out.println("char work " + ArrayCharType[0]);
        System.out.println("char work " + ArrayCharType[1]);
        System.out.println("char work " + ArrayCharType[2]);
        System.out.println("char work " + ArrayCharType[3]);
        System.out.println("char work " + ArrayCharType[4]);


        System.out.println("***********************");

        double[] someDoubleArrayType = {12, 23, 34, 64, 66};// this is the way we're declaring the known values.
        double[] withFixedSize = new double[5]; // this object can hold four vaues
        withFixedSize[0] = 12.00;
        withFixedSize[1] = 20.00;
        withFixedSize[2] = 30.00;
        withFixedSize[3] = 40.00;
        withFixedSize[4] = 50.00;


        System.out.println("Print size of Fixed Array is : " + withFixedSize.length +
                withFixedSize[0] + withFixedSize[0] + withFixedSize[1] + withFixedSize[2]);


        /** HomeWork from
         *
         *
         *     Declare Fixed Size of Array, Ex: String[] aay = new String[10];
         *     Assign Index at [2], [4], [6], [8];
         *     Print your program;
         *
         */

        String[] HomeWorkFixedString = new String[10];
        HomeWorkFixedString[2] = "Second Value";
        HomeWorkFixedString[4] = "Fourth Value";
        HomeWorkFixedString[6] = "Sixth Value";
        HomeWorkFixedString[8] = "Eighths Value";

        System.out.println("Value Index # 2, 4 ,6,8 : " + HomeWorkFixedString[2] + HomeWorkFixedString[4] + HomeWorkFixedString[6] + HomeWorkFixedString[8]);


        //Array types once it is declaring it is fixed size and we can't change the size;
        // This is the limitation of the Arrays;


        /** HomeWork from Java Operators "Arithmetic"
         *
         *      * Find out multiplication of these numbers 256 and 18 and print result to Console output with appropriate message;
         *      * Find out division of these numbers 840 and 20 and print result to Console output with appropriate message;
         *      * Find out modulus of these numbers 100 and 25 and print result to Console output with appropriate message;
         *      * Find out modulus of these numbers 100 and 17 and print result to Console output with appropriate message;
         *
         *    Addition: +
         *    Subtraction: -
         *    Multiplication: *
         *    Division: /
         *    Modules: %
         *
         *    Increment ++
         *    Decrement --
         *
         */
        System.out.println("********************");

        int a = 256;
        int b = 18;

        int c = a + b;
        int d = a / b;
        int e = a - b;
        int f = a * b;

        System.out.println("Multiplication of 256 * 18 = " + f);

        int aa = 840;
        int bb = 20;

        int cc = aa / bb;

        System.out.println("Division of 840 / 20 = "  + cc );

        int aaa = 100;
        int bbb = 25;

        int ccc = aaa % bbb;

        System.out.println(" Modules of 100 % 25 = " + ccc);

        int aaaa = 100;
        int bbbb = 17;

        int cccc = aaaa % bbbb;

        System.out.println(" Modules of 100 % 17 = " + cccc);



        /**  Assignment operator:
         *  +=
         *  -=
         *  *=
         *  /=
         *
         */
 int x = 5;
      x = 10; //reassigned to 10;
        x = x + 20;

        System.out.println("Value of addition x=10; x +=20 : "  + x);

        x = 20;
        x = x + 100; // x = x + 100;

        System.out.println("Value of addition x=20; x+=100; : " + x);

int y = 10;
y*=5; //y = 10 * 5;

        System.out.println("Value of multiplication of y=10, y *=5; : " +y);

   int z = 100;
   z -= 40; //z = 100 - 40;

        System.out.println("Subtraction  of Value of z=100, z -=40; : " +z);

        int g= 100;
        g *=100;

        System.out.println("Multiplication of Value g=100, g *=100; " +g);



        System.out.println( "***************Finish***********");





    }

}



        /**
         *HomeWork for 3rd Class:
         *
         * Int a = 15;
         * Int b = 3;
         * Find out if “a” is equals to “b”
         * Find out if “a” is greater than  to “b”
         * Find out if “a” is less than  to “b”
         * Find out if “a” doesn’t equal  than  to “b”
         * Find out if “a” is greater than  to “b”
         * and print result to Console output with appropriate message;
         *
         * Int c = 20
         * Find out if value of c is greater than 10 and less than 30;
         * Find out if value of c is greater than 50 or less than 30;
         * Find out if value of c is greater than 10 and less than 30 - reverse your program;
         *
         * Practice Pre Post Increments:
         * int x = 4;
         * int y = (++x) + 100;
         *
         * int x = 4;
         * int y = (x++) + 100;
         *
         *
         *
         *
         *
         * Practice Pre Post decrement:
         * int aa = 10;
         * int bb = (--aa) + 100;
         * System.out.println(bb);
         *
         * int aa = 10;
         * int bb = (aa–) + 100;
         * System.out.println(bb);
         *
         * */



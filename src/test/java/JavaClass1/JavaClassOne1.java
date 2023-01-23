package JavaClass1;

import java.util.ArrayList;
import java.util.List;

public class JavaClassOne1 {
    public static void main(String[] args) {



        byte someByte =  10;
        short someShort = 20;
        int someInt = 30;
        long someLong = 40L;
        float someFloat = 50F;
        double someDouble = 60.00;
        boolean someBoolean = true;
        char someChar = 'b';


        System.out.println(someByte);
        System.out.println(someShort);
        System.out.println(someInt +" "+ someLong +" "+ someFloat +" "+ someDouble +" "+ someBoolean +" "+ someChar);



        String someString = "Just creating some String data type";
        System.out.println(someString);

        String[] someStrings = {"String 1", "String 2", "String 3", "String 4", "String 5"};

        String  string1 = "String 1";
        String  string2 = "String 2";
        String  string3 = "String 3";
        String  string4 = "String 4";
        String  string5 = "String 5";

        /**
         * String1 -- internally assigned to the index 0
         * String2 -- internally assigned to the index 1
         * String3 -- internally assigned to the index 2
         * String4 -- internally assigned to the index 3
         * String5 -- internally assigned to the index 4
         *
         * */

        System.out.println("*********************************");

        System.out.println(someStrings[2]);

        System.out.println("*********************************");

        System.out.println(someStrings[0]);

        System.out.println("*********************************");

        System.out.println(someStrings[4]);

        System.out.println("*********************************");

        System.out.println(someStrings[1]);

        System.out.println("*********************************");

        System.out.println(someStrings[3]);

        System.out.println("*********************************");



        byte b = 5; // can hold only 1 values, which is 5;
        byte c = 2;
        byte d = 3;
        byte e = 4;





        byte[] iCanWriteAnythingIwant = {2,3,4,5}; // array type of a byte, and it hold hold multiple values of the same
        //Data type.
        System.out.println("I'm printing Values of 4 : " + iCanWriteAnythingIwant[2]);
        System.out.println("I'm printing Values of 2 : " + iCanWriteAnythingIwant[0]);


        int [] someArrayInt = {150, 160, 170};// array types of a int






        System.out.println(5);
        System.out.println(1000000);

        System.out.println("Anything I want");
        System.out.println("With quotation marks");

    }


        /**
         * Package --> Import ---> Class
         * PIC
         *
         *
         *
         * psvm --- shortcut for calling main method;
         * All code lines are written within methods or functions;
         *
         *
         * sout --- shortcut for Printing output;
         *
         *
         * We can ignore some lines of code by "commenting out";
         * // --- single line comment
         *
         *
         * SHIFT+CTL+/
         * If you want to comment out multiple lines of code
         *
         *
         *
         *
         *
         *
         **/


        List l = new ArrayList();




        /**
         * Java DataTypes:
         * Primitive:
         *
         * byte --- can store numbers from -127 to 128
         * short --- can store anything from -32 000 to 32 0000
         * int --- can store -2 000 000 000 to 2 000 000 000
         * long --- can store - 9 000 000 000 000 to 9 000 000 000 000, always identified by "L"
         * float --- only stores fractional numbers and identified by "f"
         * double --- only stores fractional numbers
         * boolean --- checks whether statement "true" or "false"
         * char --- single character like 'a'
         *
         * Non-primitive:
         *
         * String --- some combination of letter and words;
         * Arrays --- Datatype[] variableName = {someValue1,someValue2,someValue3};
         * Classes --- all user-defined Classes;
         *
         *
         * In Java there is position of values known as "index" and we can call for certain Index number by passing Index#
         * Index starts from  ZERO
         *
         *
         *
         *
         * Declare --- writing certain Data types;
         * Assign --- creating certain values to certain data type;
         *
         *
         **/







}

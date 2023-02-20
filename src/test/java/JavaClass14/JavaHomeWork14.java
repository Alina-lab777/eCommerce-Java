package JavaClass14;

import JavaClass13.JavaHomeWork13;

public class JavaHomeWork14 {
    public static void main(String[] args) {

        /**
         * 1. Write the Fibonacci series program (next number is the sum of previous two numbers
         * for example 0, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
         * The first two numbers of fibonacci series are 0 and 1)
         *
         *  Use this flow:
         *      1. Create int num1 = 0; int num2 = 1; int num3; int count = 10;
         *      2. Start Your Loop starting from 0 and less= than count;
         *      3. num3 = num1 + num2;
         *      4. sout it here;
         *      5. In order to see added values at the next index, do some "magic" with reassigning num1,num2,num3;
         *      6. Just think;
         *
         *
         *
         * 2. Print the biggest number in Array of int
         *      Example: int[] arr = {15,150,25,40,57,80}
         *      Output should be: Biggest number in given array: 150
         *
         *
         *
         *
         * 3. Print the smallest number in Array of int
         *      Example: int[] arr = {112,150,25,40,57,80}
         *      Output should be: Smallest number in given array: 25
         *
         *      Use this flow:
         *        1. Start the For Loop;
         *        2. Create int createdIntVar and assign it to arr[0] --- arr at Zero Index (112)
         *        3. if statement put comparison arr[LoopVar] vs createdIntVar
         *        4. sout the smallest number;
         *
         **/

        int num = 0;
        int num2 = 1;
        int numTot;
        int count = 10;

        for (int i = 2; i < count; i++) {
            numTot = num + num2;
            System.out.println("Total number " + numTot);
            numTot = numTot + num2;

            if (numTot + num2 >= count) {
            }
            System.out.println("Fibonacci " + numTot);
        }
        /**
         *    1. I will assign value 0 and 1 to int var1 and int var 2
         *    2. I will assign sum of var1 and var2 to var3.
         *    3. I will use For Loop method and set array var less or equal to 10.
         *    4. I will set conditions that will loop each time by adding and  last two values.
         *    5. I will sout it as sum.
         * */


        int[] arrB = {15, 150, 25, 40, 57, 80};
        int o = 0;
        for (int i = 0; i < arrB.length; i++) {

        }



        int[] arrS = {112, 150, 25, 40, 57, 80};
        int k = 0;

        for (int i = 0; i < arrS.length; i++) {

        }

        System.out.println("=================================================================");

        int dreamS = 110;
        for (int offeredS = 95; offeredS <= dreamS; offeredS++) {
            if (offeredS >= dreamS) {
                System.out.println("Offer is Accepted " + dreamS);
            } else {
                System.out.println("Offer is not accepted " + offeredS);
            }
        }


        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("output with break " + i);
        }

        int[] arr = {21, 34, 54, 453, 32, 233, 352, 314};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 32) {
                break;
            }
            System.out.println(arr[i] + " Output with array break at : " + i);
        }

        String[] array = {"seven", "four", "hello", "zero", "twenty", "fourthly"};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "hello") {   // breaks at String "hello"
                break;
            }
            System.out.println(array[i] + " - Output String array at round : " + i);
        }


        int[] continueArray = {21, 31, 23, 34, 45, 54, 56, 76};

        for (int i = 0; i < continueArray.length; i++) {
            if (continueArray[i] == 54) { //54 omitted
                continue;
            }
            System.out.println(continueArray[i] + " Array at round " + i);
        }


        String[] continueArr = {"sdf", "alfalfa", "mahmud", "demis", "guru", "cruger"};
        for (int i = 0; i < continueArr.length; i++) {
            if (continueArr[i].equalsIgnoreCase("demis")) { // will omit  "demis"
                continue;
            }
            System.out.println(continueArr[i] + " - Array at round - " + i);
        }

        /**
         *  OOP - Object Orientated Programming;
         *  In Java we have ability to obtain the property from other classes hold;
         *  We create an object of than class
         *
         / *   Syntax----CLassName var = new ClassName();
         *
         * */

        JavaHomeWork13 obj = new JavaHomeWork13(); // Object created JavaHomeWork13 and obj holds properties of that class;
        System.out.println(obj.someVarClass13); //sout 15

        System.out.println(obj.someMethodFromClass13()); //CTRL and LEFT click


    }
}

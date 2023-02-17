package JavaClass14;

import JavaClass13.JavaClassWork13;

public class JavaClassWork14 {
    public static void main(String[] args) {

   /**
    * int var = 10;
    *  switch (var) {
    *      case 1 :
    *      // Block of Code;
    *      break; -------- > we need to break, because it will run other Cases as well;
    *      case 2 :
    *      // Block of Code;
    *      break;
    *
    *      default:
    *      // Block of Code;
    *  }
    *
    **/


        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println( " Output with break : " + i);
        }


        // ==    -----> comparison;
        // =     ------> assignment;

      int [] arr = {2,55,99,213,12, 100,130};

        for (int j =0; j<arr.length; j++){
            if (arr[j] == 12){ // asking here if arr[j] holds number 12, then break the Loop;
                break;
            }
            System.out.println("Output with Arr break : " + arr[j] + " - At number of rounds : " + j);
        }



        String [] stringArr = {"seven", "four", "nine", "zero", "twenty"};

        for (int k = 0; k<stringArr.length; k++){
            if (stringArr[k].equalsIgnoreCase("zero")){
                break;
            }
            System.out.println("Output with String Arr break : "   + stringArr[k] +   " At number of rounds : " + k);
        }




        // Continue;


        int [] arr2 = {2,55,99,213,12, 100,130};

        for (int j =0; j<arr2.length; j++){
            if (arr2[j] == 12){ // asking here if arr2[j] holds number 12, then skip it, and execute till the end;
                continue;
            }
            System.out.println("Output with Arr Continue : " + arr2[j] + " - At number of rounds : " + j);
        }




        String [] stringArr2 = {"seven", "four", "nine", "zero", "twenty"};

        for (int k = 0; k<stringArr2.length; k++){
            if (stringArr[k].equals("zero")){
                continue;
            }
            System.out.println("Output with String Arr Continue : "   + stringArr2[k] +   " - At number of rounds : " + k);
        }



        /**
         * OOP --- > Stands for Object Oriented Programming;
         *
         * In Java we have the ability to inherit or obtain the Property or Values that the other Classes hold;
         *
         * In order to get all things other Classes hold, we create an Object of that Class;
         *
         *
         *  Syntax to Create an Object :
         *
         *  ClassName var = new ClassName();
         *
         **/


        JavaClassWork13 obj = new JavaClassWork13();
        // I just created an Object of  JavaClassWork13, and "obj" holds properties of that Class;


        System.out.println("================================");

        System.out.println(obj.someVarFromClass13);

        System.out.println(obj.someMethodFromClass13());








    }
}
